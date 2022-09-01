<template>
	<v-container>
		<v-form ref="form" lazy-validation>
			<v-card elevation="10" outlined width="100%" class="mx-auto">
				<v-card-title>
					<span class="mr-2">Write</span>
				</v-card-title>
				<v-card-text>
					<v-text-field
						label="Title"
						:rules="rules"
						:counter="100"
						v-model="title"
					></v-text-field>
					<!-- <input type="file" @change="onFileUpload" />  -->
					<v-file-input
						show-size
						label="파일 1개 등록하기"
						v-model="file"
						:rules="file_rules"
					></v-file-input>
					<v-file-input
						show-size
						counter
						small-chips
						multiple
						label="파일 여러개 등록 가능"
						v-model="files"
						:rules="files_rules"
					></v-file-input>
					<a v-on:click="onFileDownload">onFileDownload</a>
					<Editor ref="editor" />
				</v-card-text>
				<v-card-actions>
					<v-spacer></v-spacer>
					<Button
						@click="save"
						color="success"
						rounded
						small
						iconName="mdi-content-save-all"
						btnName="Save"
					></Button>
					<Button
						@click="movePage('/list')"
						color="grey darken-1"
						rounded
						small
						iconName="mdi-arrow-left"
						btnName="Back"
					></Button>
				</v-card-actions>
			</v-card>
		</v-form>
	</v-container>
</template>

<script>
import Editor from '@/components/common/Editor'
import axios from 'axios'
export default {
	components: {
		Editor,
	},
	data: () => ({
		rules: [
			value => !!value || 'Required.',
			value => (value && value.length >= 3) || 'Min 3 characters',
		],
		file_rules: [
			v => !(v && v.size > 5000000) || '5MB 이상의 파일은 첨부할 수 없습니다.',
		],
		files_rules: [
			v => !(v && v.size > 5000000) || '5MB 이상의 파일은 첨부할 수 없습니다.',
			v => !(v && v.length > 5) || '파일은 최대 5개까지만 등록할 수 있습니다.',
		],
		title: '',
		file: null,
		files: null,
	}),
	methods: {
		onFileDownload() {
			const form = new FormData()
			form.append('filepath', 'board')
			form.append('filename', 'a.txt')
			form.append('originFileName', 'a.txt')

			//let reqHeaders = store.state.api.common

			axios
				.post('http://localhost:8090/board/downloadFile', form, {
					// 요청
					headers: this.headers,
					responseType: 'blob',
					data: form,
					params: {
						param1: 1,
						parma2: '한글',
						parma3: 'eng!@',
					},
				})
				.then(response => {
					const fileName = 'a.txt'
					const data = response.data
					if (!data) {
						return
					}
					const url = window.URL.createObjectURL(new Blob([data]))
					const a = document.createElement('a')
					a.style.display = 'none'
					a.href = url
					a.setAttribute('download', fileName)
					document.body.appendChild(a)
					a.click()
					document.body.removeChild(a)
					window.URL.revokeObjectURL(url)
				})
				.catch(error => {
					console.log(error)
				})
		},
		async save() {
			var content = this.$refs.editor.getContent()
			var title = this.title
			const validate = this.$refs.form.validate()
			if (!validate) {
				alert('빨간 메세지를 확인하세요.')
				return
			}
			// 파일복수개는 https://minu0807.tistory.com/111에 자세한 설명
			const formData = new FormData()
			if (this.file != null) {
				formData.append(this.file.name, this.file)
			}
			if (this.files != null) {
				for (let i in this.files) {
					formData.append(this.files[i].name, this.files[i])
				}
			}
			formData.append('title', title)
			formData.append('content', content)
			let res = await this.confirmDialog(
				'Confirm Write',
				'Do you want to save it?',
			)
			if (res) {
				axios
					.post('http://localhost:8090/board/insert', formData, {
						// 요청
						headers: {
							'Content-Type': 'multipart/form-data',
						},
					})
					.then(response => {
						if (response.data > 0) {
							this.$store.commit('SET_SNACKBAR', {
								show: true,
								msg: 'Insert Complete',
								color: 'success',
							})
							this.movePage('/detail?docNo=' + response.data)
						}
					})
					.catch(error => {
						console.log(error)
					})
			}
		},
	},
}
</script>

<style></style>

<template>
	<div>
		<v-container>
			<v-card class="mx-auto" max-width="500" tile>
				<v-card-title>
					https://vuetifyjs.com/en/api/v-pagination/#links
				</v-card-title>
				<v-card-title>
					1. v-alert
				</v-card-title>
				<v-card-text>
					<div>
						<v-alert type="success">
							I'm a success alert.
						</v-alert>
						<v-alert type="info">
							I'm a info alert.
						</v-alert>
						<v-alert type="warning">
							I'm a warning alert.
						</v-alert>
						<v-alert type="error">
							I'm a error alert.
						</v-alert>
					</div>
				</v-card-text>
				<v-card-title>
					2. v-app (div태그랑 비슷한 기능)
				</v-card-title>
				<v-card-title>
					<v-app>
						<!--#1. 가장 상위 태그-->

						<!-- <v-navigation-drawer app>-->
						<!--#2. 메뉴 보여줄 navigation bar-->
						<!-- </v-navigation-drawer>-->

						<!-- <v-app-bar app>-->
						<!-- #3. appbar 영역-->
						<!-- </v-app-bar>-->

						<v-main>
							<v-container fluid>
								<router-view></router-view>
								<!-- #4. router에서 맵핑해준 화면을 보여주는 영역-->
								<v-card-title>
									ㅎㅎㅎㅎ
								</v-card-title>
							</v-container>
						</v-main>

						<v-footer app> </v-footer>
					</v-app>
				</v-card-title>
				<v-card-title>
					3. v-app-bar (맨 위에 버튼 있고 HOME, BOARD)
				</v-card-title>
				<v-card-title>
					<template>
						<v-app-bar app color="blue-grey darken-1" dark>
							<v-app-bar-nav-icon></v-app-bar-nav-icon>
							<v-app-bar-title>Project</v-app-bar-title>
							<v-btn @click="movePage('/home')" text>
								<span class="mr-2">Home</span>
							</v-btn>
							<v-btn @click="movePage('/list')" text>
								<span class="mr-2">Board</span>
							</v-btn>
							<v-btn @click="movePage('/tag')" text>
								<span class="mr-2">Tag</span>
							</v-btn>
							<v-spacer></v-spacer>
							<Clock />
							<v-divider class="mx-4" inset vertical></v-divider>
							<Weather />
						</v-app-bar>
					</template>
				</v-card-title>
				<v-card-title>
					4. v-app-bar-nav-icon (3번에 있음)
				</v-card-title>
				<v-card-title>
					5. v-app-bar-tilte (3번에 있음)
				</v-card-title>
				<v-card-title>
					6. v-autocomplete
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-autocomplete
								:items="people"
								item-text="name"
								item-value="name"
								v-model="friends"
								return-object
								multiple
								@input="inputChanged"
								:search-input.sync="userInput"
							></v-autocomplete>
							<!-- ... -->
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					7. v-avatar
				</v-card-title>
				<v-card-title>
					<template>
						<!-- <v-avatar size="100" style="position:absolute; top: 130px">-->
						<v-avatar size="100">
							<v-img
								src="https://cdn.vuetifyjs.com/images/profiles/marcus.jpg"
							></v-img>
						</v-avatar>
					</template>
				</v-card-title>
				<v-card-title>
					8. v-badge
				</v-card-title>
				<v-card-title>
					<template>
						<v-container>
							<v-row class="text-center">
								<v-col col="12">
									<v-toolbar>
										<v-tabs dark background-color="primary" grow>
											<v-tab>
												<v-badge color="pink" dot>One</v-badge>
											</v-tab>
											<v-tab>
												<v-badge color="green" content="6">Two</v-badge>
											</v-tab>
											<v-tab>
												<v-badge color="deep-purple accent-4" icon="mdi-vuetify"
													>Three</v-badge
												>
											</v-tab>
										</v-tabs>
									</v-toolbar>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					9. v-banner
				</v-card-title>
				<v-card-title>
					<template>
						<v-container>
							<v-row class="text-center">
								<v-col col="12">
									<v-banner
										icon="mdi-vuetify"
										color="green"
										single-line
										:sticky="sticky"
									>
										Hello world.
										<template v-slot:actions>
											<v-btn text color="deep-purple accent-4"
												>Get Online</v-btn
											>
										</template>
									</v-banner>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					10. v-bottom-navigation (맨 밑에 Music, Books, Photos)
				</v-card-title>
				<v-card-title>
					<template>
						<v-app>
							<v-app-bar color="primary" app dark>
								<v-toolbar-title>App Bar</v-toolbar-title>
							</v-app-bar>
							<v-main>
								<v-container
									>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis
									blanditiis beatae praesentium repudiandae sunt officiis, vero
									maxime officia obcaecati nisi excepturi. Sit laboriosam
									provident laborum? Rem recusandae ea possimus
									illo.</v-container
								>
							</v-main>
							<v-bottom-navigation v-model="value" app>
								<v-btn value="music" height="100%">
									<span>Music</span>
									<v-icon>mdi-music</v-icon>
								</v-btn>

								<v-btn value="books" height="100%">
									<span>Books</span>
									<v-icon>mdi-book</v-icon>
								</v-btn>

								<v-btn value="photos" height="100%">
									<span>Photos</span>
									<v-icon>mdi-image</v-icon>
								</v-btn>
							</v-bottom-navigation>
						</v-app>
					</template>
				</v-card-title>
				<v-card-title>
					11. v-bottom-sheet
				</v-card-title>
				<v-card-title>
					<template>
						<v-app>
							<div class="ma-4 text-center">
								<v-bottom-sheet v-model="sheet">
									<template v-slot:activator="{ on, attrs }">
										<v-btn v-bind="attrs" v-on="on" color="primary">
											Open Sheet
										</v-btn>
									</template>
									<v-sheet class="text-center" height="100px">
										<v-btn
											class="mt-6"
											text
											color="red"
											@click="sheet = !sheet"
										>
											close
										</v-btn>
										<div class="my-3">This is a bottom sheet</div>
									</v-sheet>
								</v-bottom-sheet>
							</div>
						</v-app>
					</template>
				</v-card-title>
				<v-card-title>
					12. v-breadcrumbs
				</v-card-title>
				<v-card-title>
					<template>
						<v-breadcrumbs :items="items12"></v-breadcrumbs>
						<v-breadcrumbs :items="items12" large></v-breadcrumbs>
					</template>
				</v-card-title>
				<v-card-title>
					13. v-breadcrumbs-divider
				</v-card-title>
				<v-card-title>
					<template>
						<v-breadcrumbs :items="items12" divider="-"></v-breadcrumbs>
						<v-breadcrumbs :items="items12" divider="."></v-breadcrumbs>
					</template>
					<template>
						<div>
							<v-breadcrumbs :items="items12">
								<template v-slot:divider>
									<v-icon>mdi-forward</v-icon>
								</template>
							</v-breadcrumbs>
							<v-breadcrumbs :items="items12">
								<template v-slot:divider>
									<v-icon>mdi-chevron-right</v-icon>
								</template>
							</v-breadcrumbs>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					14. v-breadcrumbs-item
				</v-card-title>
				<v-card-title>
					<template>
						<v-breadcrumbs :items="items12">
							<template v-slot:item="{ item }">
								<v-breadcrumbs-item :href="item.href" :disabled="item.disabled">
									{{ item.text.toUpperCase() }}
								</v-breadcrumbs-item>
							</template>
						</v-breadcrumbs>
					</template>
				</v-card-title>
				<v-card-title>
					15. v-btn
				</v-card-title>
				<v-card-title>
					<template>
						<v-row>
							<v-col cols="12" sm="6" class="py-2">
								<p>Exclusive</p>

								<v-btn-toggle v-model="toggle_exclusive">
									<v-btn>
										<v-icon>mdi-format-align-left</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-center</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-right</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-justify</v-icon>
									</v-btn>
								</v-btn-toggle>
							</v-col>

							<v-col cols="12" sm="6" class="py-2">
								<p>Multiple</p>

								<v-btn-toggle
									v-model="toggle_multiple"
									dense
									background-color="primary"
									dark
									multiple
								>
									<v-btn>
										<v-icon>mdi-format-bold</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-italic</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-underline</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-color-fill</v-icon>
									</v-btn>
								</v-btn-toggle>
							</v-col>

							<v-col cols="12" sm="6" class="py-2">
								<p>No Options Selected</p>

								<v-btn-toggle v-model="toggle_none">
									<v-btn>
										<v-icon>mdi-format-align-left</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-center</v-icon>
									</v-btn>
									<v-btn>
										<v-icon>mdi-format-align-right</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-justify</v-icon>
									</v-btn>
								</v-btn-toggle>
							</v-col>

							<v-col cols="12" sm="6" class="py-2">
								<p>Mandatory</p>

								<v-btn-toggle v-model="toggle_one" shaped mandatory>
									<v-btn>
										<v-icon>mdi-format-align-left</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-center</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-right</v-icon>
									</v-btn>

									<v-btn>
										<v-icon>mdi-format-align-justify</v-icon>
									</v-btn>
								</v-btn-toggle>
							</v-col>

							<v-col cols="12" class="py-2">
								<p>Text Options</p>

								<v-btn-toggle
									v-model="text"
									tile
									color="deep-purple accent-3"
									group
								>
									<v-btn value="left">
										Left
									</v-btn>

									<v-btn value="center">
										Center
									</v-btn>

									<v-btn value="right">
										Right
									</v-btn>

									<v-btn value="justify">
										Justify
									</v-btn>
								</v-btn-toggle>
							</v-col>

							<v-col cols="12" class="py-2">
								<p>Text &amp; Icon Options</p>

								<v-btn-toggle v-model="icon" borderless>
									<v-btn value="left">
										<span class="hidden-sm-and-down">Left</span>

										<v-icon right>
											mdi-format-align-left
										</v-icon>
									</v-btn>

									<v-btn value="center">
										<span class="hidden-sm-and-down">Center</span>

										<v-icon right>
											mdi-format-align-center
										</v-icon>
									</v-btn>

									<v-btn value="right">
										<span class="hidden-sm-and-down">Right</span>

										<v-icon right>
											mdi-format-align-right
										</v-icon>
									</v-btn>

									<v-btn value="justify">
										<span class="hidden-sm-and-down">Justify</span>

										<v-icon right>
											mdi-format-align-justify
										</v-icon>
									</v-btn>
								</v-btn-toggle>
							</v-col>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					16. v-btn-toggle (15번 v-btn 참조)
				</v-card-title>
				<v-card-title>
					17. v-calendar
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-sheet tile height="54" class="d-flex">
								<v-btn icon class="ma-2" @click="$refs.calendar.prev()">
									<v-icon>mdi-chevron-left</v-icon>
								</v-btn>
								<v-select
									v-model="type"
									:items="types"
									dense
									outlined
									hide-details
									class="ma-2"
									label="type"
								></v-select>
								<v-select
									v-model="mode"
									:items="modes"
									dense
									outlined
									hide-details
									label="event-overlap-mode"
									class="ma-2"
								></v-select>
								<v-select
									v-model="weekday"
									:items="weekdays"
									dense
									outlined
									hide-details
									label="weekdays"
									class="ma-2"
								></v-select>
								<v-spacer></v-spacer>
								<v-btn icon class="ma-2" @click="$refs.calendar.next()">
									<v-icon>mdi-chevron-right</v-icon>
								</v-btn>
							</v-sheet>
							<v-sheet height="600">
								<v-calendar
									ref="calendar"
									v-model="value"
									:weekdays="weekday"
									:type="type"
									:events="events"
									:event-overlap-mode="mode"
									:event-overlap-threshold="30"
									:event-color="getEventColor"
									@change="getEvents"
								></v-calendar>
							</v-sheet>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					18. v-calendar-daily (17번 type day로 변경)
				</v-card-title>
				<v-card-title>
					19. v-calendar-monthly (17번 type month로 변경)
				</v-card-title>
				<v-card-title>
					20. v-calendar-weekly (17번 type week로 변경)
				</v-card-title>
				<v-card-title>
					21. v-card (v-card-title, v-card-subtitle, v-card-text and
					v-card-actions)
				</v-card-title>
				<v-card-title>
					<template>
						<v-card :loading="loading" class="mx-auto my-12" max-width="374">
							<template slot="progress">
								<v-progress-linear
									color="deep-purple"
									height="10"
									indeterminate
								></v-progress-linear>
							</template>

							<v-img
								height="250"
								src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
							></v-img>

							<v-card-title>Cafe Badilico</v-card-title>

							<v-card-text>
								<v-row align="center" class="mx-0">
									<v-rating
										:value="4.5"
										color="amber"
										dense
										half-increments
										readonly
										size="14"
									></v-rating>

									<div class="grey--text ms-4">
										4.5 (413)
									</div>
								</v-row>

								<div class="my-4 text-subtitle-1">
									$ • Italian, Cafe
								</div>

								<div>
									Small plates, salads & sandwiches - an intimate setting with
									12 indoor seats plus patio seating.
								</div>
							</v-card-text>

							<v-divider class="mx-4"></v-divider>

							<v-card-title>Tonight's availability</v-card-title>

							<v-card-text>
								<v-chip-group
									v-model="selection"
									active-class="deep-purple accent-4 white--text"
									column
								>
									<v-chip>5:30PM</v-chip>

									<v-chip>7:30PM</v-chip>

									<v-chip>8:00PM</v-chip>

									<v-chip>9:00PM</v-chip>
								</v-chip-group>
							</v-card-text>

							<v-card-actions>
								<v-btn color="deep-purple lighten-2" text @click="reserve">
									Reserve
								</v-btn>
							</v-card-actions>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					22. v-card-actions (21번 참조)
				</v-card-title>
				<v-card-title>
					23. v-card-subtitle
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" max-width="344">
							<v-img
								src="https://cdn.vuetifyjs.com/images/cards/sunshine.jpg"
								height="200px"
							></v-img>

							<v-card-title>
								Top western road trips
							</v-card-title>

							<v-card-subtitle>
								1,000 miles of wonder
							</v-card-subtitle>

							<v-card-actions>
								<v-btn color="orange lighten-2" text>
									Explore
								</v-btn>

								<v-spacer></v-spacer>

								<v-btn icon @click="show = !show">
									<v-icon>{{
										show ? 'mdi-chevron-up' : 'mdi-chevron-down'
									}}</v-icon>
								</v-btn>
							</v-card-actions>

							<v-expand-transition>
								<div v-show="show">
									<v-divider></v-divider>

									<v-card-text>
										I'm a thing. But, like most politicians, he promised more
										than he could deliver. You won't have time for sleeping,
										soldier, not with all the bed making you'll be doing. Then
										we'll go with that data file! Hey, you add a one and two
										zeros to that or we walk! You're going to do his laundry?
										I've got to find a way to escape.
									</v-card-text>
								</div>
							</v-expand-transition>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					24. v-card-text (21번 참조)
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" max-width="500">
							<v-system-bar color="indigo darken-2" dark>
								<v-spacer></v-spacer>

								<v-icon>mdi-window-minimize</v-icon>

								<v-icon>mdi-window-maximize</v-icon>

								<v-icon>mdi-close</v-icon>
							</v-system-bar>

							<v-toolbar color="indigo" dark>
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>Discover</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>
							</v-toolbar>

							<v-container fluid>
								<v-row dense>
									<v-col
										v-for="card in cards"
										:key="card.title"
										:cols="card.flex"
									>
										<v-card>
											<v-img
												:src="card.src"
												class="white--text align-end"
												gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)"
												height="200px"
											>
												<v-card-title v-text="card.title"></v-card-title>
											</v-img>

											<v-card-actions>
												<v-spacer></v-spacer>

												<v-btn icon>
													<v-icon>mdi-heart</v-icon>
												</v-btn>

												<v-btn icon>
													<v-icon>mdi-bookmark</v-icon>
												</v-btn>

												<v-btn icon>
													<v-icon>mdi-share-variant</v-icon>
												</v-btn>
											</v-card-actions>
										</v-card>
									</v-col>
								</v-row>
							</v-container>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					25. v-card-title (21번 참조)
				</v-card-title>
				<v-card-title>
					<template>
						<v-card max-width="400" class="mx-auto">
							<v-system-bar color="pink darken-2" dark>
								<v-spacer></v-spacer>

								<v-icon>mdi-window-minimize</v-icon>

								<v-icon>mdi-window-maximize</v-icon>

								<v-icon>mdi-close</v-icon>
							</v-system-bar>

							<v-app-bar dark color="pink">
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>My Music</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>
							</v-app-bar>

							<v-container>
								<v-row dense>
									<v-col cols="12">
										<v-card color="#385F73" dark>
											<v-card-title class="text-h5">
												Unlimited music now
											</v-card-title>

											<v-card-subtitle
												>Listen to your favorite artists and albums whenever and
												wherever, online and offline.</v-card-subtitle
											>

											<v-card-actions>
												<v-btn text>
													Listen Now
												</v-btn>
											</v-card-actions>
										</v-card>
									</v-col>

									<v-col v-for="(item, i) in items25" :key="i" cols="12">
										<v-card :color="item.color" dark>
											<div class="d-flex flex-no-wrap justify-space-between">
												<div>
													<v-card-title
														class="text-h5"
														v-text="item.title"
													></v-card-title>

													<v-card-subtitle
														v-text="item.artist"
													></v-card-subtitle>

													<v-card-actions>
														<v-btn
															v-if="item.artist === 'Ellie Goulding'"
															class="ml-2 mt-3"
															fab
															icon
															height="40px"
															right
															width="40px"
														>
															<v-icon>mdi-play</v-icon>
														</v-btn>

														<v-btn
															v-else
															class="ml-2 mt-5"
															outlined
															rounded
															small
														>
															START RADIO
														</v-btn>
													</v-card-actions>
												</div>

												<v-avatar class="ma-3" size="125" tile>
													<v-img :src="item.src"></v-img>
												</v-avatar>
											</div>
										</v-card>
									</v-col>
								</v-row>
							</v-container>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					26. v-carousel
				</v-card-title>
				<v-card-title>
					<template>
						<v-carousel v-model="model">
							<v-carousel-item v-for="(color, i) in colors26" :key="color">
								<v-sheet :color="color" height="100%" tile>
									<v-row class="fill-height" align="center" justify="center">
										<div class="text-h2">Slide {{ i + 1 }}</div>
									</v-row>
								</v-sheet>
							</v-carousel-item>
						</v-carousel>
					</template>
				</v-card-title>
				<v-card-title>
					27. v-carousel-item
				</v-card-title>
				<v-card-title>
					<template>
						<v-card elevation="24" max-width="444" class="mx-auto">
							<v-system-bar lights-out></v-system-bar>
							<v-carousel
								:continuous="false"
								:cycle="cycle27"
								:show-arrows="false"
								hide-delimiter-background
								delimiter-icon="mdi-minus"
								height="300"
							>
								<v-carousel-item v-for="(slide, i) in slides27" :key="i">
									<v-sheet :color="colors27[i]" height="100%" tile>
										<v-row class="fill-height" align="center" justify="center">
											<div class="text-h2">{{ slide }} Slide</div>
										</v-row>
									</v-sheet>
								</v-carousel-item>
							</v-carousel>
							<v-list two-line>
								<v-list-item>
									<v-list-item-avatar>
										<v-img
											src="https://cdn.vuetifyjs.com/images/john.png"
										></v-img>
									</v-list-item-avatar>
									<v-list-item-content>
										<v-list-item-title>John Leider</v-list-item-title>
										<v-list-item-subtitle>Author</v-list-item-subtitle>
									</v-list-item-content>
									<v-list-item-action>
										<v-switch
											v-model="cycle"
											label="Cycle Slides"
											inset
										></v-switch>
									</v-list-item-action>
								</v-list-item>
							</v-list>
						</v-card>
					</template>
					<template>
						<v-carousel>
							<v-carousel-item
								v-for="(item, i) in items27"
								:key="i"
								:src="item.src"
								reverse-transition="fade-transition"
								transition="fade-transition"
							></v-carousel-item>
						</v-carousel>
					</template>
				</v-card-title>
				<v-card-title>
					28. v-carousel-reverse-transition (자료없음)
				</v-card-title>
				<v-card-title>
					29. v-carousel-transition (자료없음)
				</v-card-title>
				<v-card-title>
					30. v-checkbox
				</v-card-title>
				<v-card-title>
					<template>
						<v-container fluid>
							<p>{{ selected }}</p>
							<v-checkbox
								v-model="selected"
								color="error"
								label="John"
								value="John"
								hide-details
							></v-checkbox>
							<v-checkbox
								v-model="selected"
								label="Jacob"
								value="Jacob"
							></v-checkbox>
						</v-container>
					</template>
					<template>
						<v-container fluid>
							<v-checkbox
								v-model="checkbox1"
								:label="`Checkbox 1: ${checkbox1.toString()}`"
							></v-checkbox>
							<v-checkbox
								v-model="checkbox2"
								:label="`Checkbox 2: ${checkbox2.toString()}`"
							></v-checkbox>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					31. v-chip
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-btn
								v-if="!chip1 && !chip2 && !chip3 && !chip4"
								close
								color="primary"
								dark
								@click="
									;(chip1 = true),
										(chip2 = true),
										(chip3 = true),
										(chip4 = true)
								"
							>
								Reset Chips
							</v-btn>

							<v-chip draggable>
								Default
							</v-chip>

							<v-chip
								v-if="chip1"
								class="ma-2"
								close
								@click:close="chip1 = false"
							>
								Closable
							</v-chip>

							<v-chip
								v-if="chip2"
								class="ma-2"
								close
								color="red"
								text-color="white"
								@click:close="chip2 = false"
							>
								Remove
							</v-chip>

							<v-chip
								v-if="chip3"
								class="ma-2"
								close
								color="green"
								outlined
								@click:close="chip3 = false"
							>
								Success
							</v-chip>

							<v-chip
								v-if="chip4"
								class="ma-2"
								close
								color="orange"
								label
								outlined
								@click:close="chip4 = false"
							>
								Complete
							</v-chip>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					32. v-col
				</v-card-title>
				<v-card-title>
					<template>
						<v-container class="grey lighten-5">
							<v-row no-gutters>
								<v-col v-for="n in 3" :key="n" cols="12" sm="4">
									<v-card class="pa-2" outlined tile>
										columns
									</v-card>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					33. v-color-picker
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="space-around">
							<v-color-picker class="ma-2" hide-canvas></v-color-picker>
							<v-color-picker class="ma-2" canvas-height="300"></v-color-picker>
							<v-color-picker class="ma-2" dot-size="30"></v-color-picker>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					34. v-container (32번참조)
				</v-card-title>
				<v-card-title>
					35. v-content (예제없음)
				</v-card-title>
				<v-card-title>
					36. v-data-footer (예제없음)
				</v-card-title>
				<v-card-title>
					37. v-data-iterator
				</v-card-title>
				<v-card-title>
					<template>
						<v-container fluid>
							<v-data-iterator
								:items="items37"
								:items-per-page.sync="itemsPerPage"
								hide-default-footer
							>
								<template v-slot:header>
									<v-toolbar class="mb-2" color="indigo darken-5" dark flat>
										<v-toolbar-title>This is a header</v-toolbar-title>
									</v-toolbar>
								</template>

								<template v-slot:default="props">
									<v-row>
										<v-col
											v-for="item in props.items"
											:key="item.name"
											cols="12"
											sm="6"
											md="4"
											lg="3"
										>
											<v-card>
												<v-card-title class="subheading font-weight-bold">
													{{ item.name }}
												</v-card-title>

												<v-divider></v-divider>

												<v-list dense>
													<v-list-item>
														<v-list-item-content>Calories:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.calories }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Fat:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.fat }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Carbs:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.carbs }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Protein:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.protein }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Sodium:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.sodium }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Calcium:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.calcium }}
														</v-list-item-content>
													</v-list-item>

													<v-list-item>
														<v-list-item-content>Iron:</v-list-item-content>
														<v-list-item-content class="align-end">
															{{ item.iron }}
														</v-list-item-content>
													</v-list-item>
												</v-list>
											</v-card>
										</v-col>
									</v-row>
								</template>

								<template v-slot:footer>
									<v-toolbar class="mt-2" color="indigo" dark flat>
										<v-toolbar-title class="subheading">
											This is a footer
										</v-toolbar-title>
									</v-toolbar>
								</template>
							</v-data-iterator>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					38. v-data-table
				</v-card-title>
				<v-card-title>
					<template>
						<v-data-table
							:headers="headers38"
							:items="desserts38"
							:items-per-page="5"
							class="elevation-1"
						></v-data-table>
					</template>
				</v-card-title>
				<v-card-title>
					39. v-data-table-header (없음)
				</v-card-title>
				<v-card-title>
					40. v-date-picker
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-date-picker v-model="picker40" type="month"></v-date-picker>
						</v-row>
					</template>
					<template>
						<v-row justify="center">
							<v-date-picker v-model="picker40"></v-date-picker>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					41. v-dialog
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-dialog v-model="dialog41" width="500">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="red lighten-2" dark v-bind="attrs" v-on="on">
										Click Me
									</v-btn>
								</template>

								<v-card>
									<v-card-title class="text-h5 grey lighten-2">
										Privacy Policy
									</v-card-title>

									<v-card-text>
										Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
										do eiusmod tempor incididunt ut labore et dolore magna
										aliqua. Ut enim ad minim veniam, quis nostrud exercitation
										ullamco laboris nisi ut aliquip ex ea commodo consequat.
										Duis aute irure dolor in reprehenderit in voluptate velit
										esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
										occaecat cupidatat non proident, sunt in culpa qui officia
										deserunt mollit anim id est laborum.
									</v-card-text>

									<v-divider></v-divider>

									<v-card-actions>
										<v-spacer></v-spacer>
										<v-btn color="primary" text @click="dialog41 = false">
											I accept
										</v-btn>
									</v-card-actions>
								</v-card>
							</v-dialog>
						</div>
					</template>

					<template>
						<v-row justify="center">
							<v-dialog v-model="dialog42" persistent max-width="600px">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" dark v-bind="attrs" v-on="on">
										Open Dialog
									</v-btn>
								</template>
								<v-card>
									<v-card-title>
										<span class="text-h5">User Profile</span>
									</v-card-title>
									<v-card-text>
										<v-container>
											<v-row>
												<v-col cols="12" sm="6" md="4">
													<v-text-field
														label="Legal first name*"
														required
													></v-text-field>
												</v-col>
												<v-col cols="12" sm="6" md="4">
													<v-text-field
														label="Legal middle name"
														hint="example of helper text only on focus"
													></v-text-field>
												</v-col>
												<v-col cols="12" sm="6" md="4">
													<v-text-field
														label="Legal last name*"
														hint="example of persistent helper text"
														persistent-hint
														required
													></v-text-field>
												</v-col>
												<v-col cols="12">
													<v-text-field label="Email*" required></v-text-field>
												</v-col>
												<v-col cols="12">
													<v-text-field
														label="Password*"
														type="password"
														required
													></v-text-field>
												</v-col>
												<v-col cols="12" sm="6">
													<v-select
														:items="['0-17', '18-29', '30-54', '54+']"
														label="Age*"
														required
													></v-select>
												</v-col>
												<v-col cols="12" sm="6">
													<v-autocomplete
														:items="[
															'Skiing',
															'Ice hockey',
															'Soccer',
															'Basketball',
															'Hockey',
															'Reading',
															'Writing',
															'Coding',
															'Basejump',
														]"
														label="Interests"
														multiple
													></v-autocomplete>
												</v-col>
											</v-row>
										</v-container>
										<small>*indicates required field</small>
									</v-card-text>
									<v-card-actions>
										<v-spacer></v-spacer>
										<v-btn color="blue darken-1" text @click="dialog42 = false">
											Close
										</v-btn>
										<v-btn color="blue darken-1" text @click="dialog42 = false">
											Save
										</v-btn>
									</v-card-actions>
								</v-card>
							</v-dialog>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					42. v-dialog-bottom-transition (v-dialog 속함 밑에서 가운데로 이동
					속성)
				</v-card-title>
				<v-card-title>
					43. v-dialog-transition (모름)
				</v-card-title>
				<v-card-title>
					44. v-divider (inset은가로, vertical은세로)
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-col cols="12" sm="8">
								<v-card>
									<v-card-title class="cyan darken-1">
										<span class="text-h5 white--text">Sarah Mcbeal</span>

										<v-spacer></v-spacer>

										<v-btn dark icon>
											<v-icon>mdi-chevron-left</v-icon>
										</v-btn>

										<v-btn dark icon>
											<v-icon>mdi-pencil</v-icon>
										</v-btn>

										<v-btn dark icon>
											<v-icon>mdi-dots-vertical</v-icon>
										</v-btn>
									</v-card-title>

									<v-list>
										<v-list-item>
											<v-list-item-action>
												<v-icon>mdi-phone</v-icon>
											</v-list-item-action>

											<v-list-item-content>
												<v-list-item-title>(650) 555-1234</v-list-item-title>
											</v-list-item-content>
											<v-list-item-action>
												<v-icon>mdi-message-text</v-icon>
											</v-list-item-action>
										</v-list-item>

										<v-divider inset></v-divider>

										<v-list-item>
											<v-list-item-action>
												<v-icon>mdi-phone</v-icon>
											</v-list-item-action>

											<v-list-item-content>
												<v-list-item-title>(323) 555-6789</v-list-item-title>
											</v-list-item-content>

											<v-list-item-action>
												<v-icon>mdi-message-text</v-icon>
											</v-list-item-action>
										</v-list-item>

										<v-divider inset></v-divider>

										<v-list-item>
											<v-list-item-action>
												<v-icon>mdi-email</v-icon>
											</v-list-item-action>

											<v-list-item-content>
												<v-list-item-title
													>mcbeal@example.com</v-list-item-title
												>
											</v-list-item-content>
										</v-list-item>

										<v-divider inset></v-divider>

										<v-list-item>
											<v-list-item-action>
												<v-icon>mdi-map-marker</v-icon>
											</v-list-item-action>

											<v-list-item-content>
												<v-list-item-title>Orlando, FL 79938</v-list-item-title>
											</v-list-item-content>
										</v-list-item>
									</v-list>

									<v-img
										src="https://picsum.photos/700?image=996"
										height="200px"
									></v-img>
								</v-card>
							</v-col>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					45. v-edit-dialog
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-data-table :headers="headers45" :items="desserts45">
								<template v-slot:item.name="props">
									<v-edit-dialog
										:return-value.sync="props.item.name"
										@save="save45"
										@cancel="cancel45"
										@open="open45"
										@close="close45"
									>
										{{ props.item.name }}
										<template v-slot:input>
											<v-text-field
												v-model="props.item.name"
												:rules="[max25chars]"
												label="Edit"
												single-line
												counter
											></v-text-field>
										</template>
									</v-edit-dialog>
								</template>
								<template v-slot:item.iron="props">
									<v-edit-dialog
										:return-value.sync="props.item.iron"
										large
										persistent
										@save="save45"
										@cancel="cancel45"
										@open="open45"
										@close="close45"
									>
										<div>{{ props.item.iron }}</div>
										<template v-slot:input>
											<div class="mt-4 text-h6">
												Update Iron
											</div>
											<v-text-field
												v-model="props.item.iron"
												:rules="[max25chars]"
												label="Edit"
												single-line
												counter
												autofocus
											></v-text-field>
										</template>
									</v-edit-dialog>
								</template>
							</v-data-table>

							<v-snackbar v-model="snack" :timeout="3000" :color="snackColor">
								{{ snackText }}

								<template v-slot:action="{ attrs }">
									<v-btn v-bind="attrs" text @click="snack = false">
										Close
									</v-btn>
								</template>
							</v-snackbar>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					46. v-expand-transition
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center" style="min-height: 160px;">
							<v-col class="shrink">
								<v-btn class="ma-2" color="primary" @click="expand = !expand">
									Expand Transition
								</v-btn>

								<v-expand-transition>
									<v-card
										v-show="expand"
										height="100"
										width="100"
										class="mx-auto secondary"
									></v-card>
								</v-expand-transition>
							</v-col>

							<div class="mx-4 hidden-sm-and-down"></div>

							<v-col class="shrink">
								<v-btn
									class="ma-2"
									color="secondary"
									@click="expand2 = !expand2"
								>
									Expand X Transition
								</v-btn>

								<v-expand-x-transition>
									<v-card
										v-show="expand2"
										height="100"
										width="100"
										class="mx-auto secondary"
									></v-card>
								</v-expand-x-transition>
							</v-col>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					47. v-expand-x-transition (46번참조)
				</v-card-title>
				<v-card-title>
					48. v-expansion-panel
				</v-card-title>
				<v-card-title>
					<template>
						<v-expansion-panels focusable>
							<v-expansion-panel v-for="(item, i) in 5" :key="i">
								<v-expansion-panel-header>Item</v-expansion-panel-header>
								<v-expansion-panel-content>
									Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
									do eiusmod tempor incididunt ut labore et dolore magna aliqua.
									Ut enim ad minim veniam, quis nostrud exercitation ullamco
									laboris nisi ut aliquip ex ea commodo consequat.
								</v-expansion-panel-content>
							</v-expansion-panel>
						</v-expansion-panels>
					</template>
				</v-card-title>
				<v-card-title>
					49. v-expansion-panel-content (48번참조)
				</v-card-title>
				<v-card-title>
					50. v-expansion-panel-header (48번참조)
				</v-card-title>
				<v-card-title>
					51. v-expansion-panels (48번참조)
				</v-card-title>
				<v-card-title>
					52. v-fab-transition (Board 탭에서 확인)
				</v-card-title>
				<v-card-title>
					53. v-fade-transition
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-menu transition="fade-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn dark color="primary" v-bind="attrs" v-on="on">
										Fade Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n">
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					54. v-file-input
				</v-card-title>
				<v-card-title>
					<template>
						<v-file-input show-size label="File input"></v-file-input>
					</template>
				</v-card-title>
				<v-card-title>
					55. v-flex
				</v-card-title>
				<v-card-title>
					<template>
						<v-app>
							<v-container>
								<v-layout column>
									<v-flex>
										<v-sheet>
											우리는 인생을 사는 이유를 깨우쳐야 한다.
										</v-sheet>
										<v-btn :label="btnLabel"></v-btn>
									</v-flex>
									<v-flex>
										<v-btn :label="btnLabel"></v-btn>
									</v-flex>
									<v-flex>
										<v-btn :label="btnLabel"></v-btn>
									</v-flex>
								</v-layout>
							</v-container>
						</v-app>
					</template>
				</v-card-title>
				<v-card-title>
					56. v-footer
				</v-card-title>
				<v-card-title>
					<template>
						<v-footer dark padless>
							<v-card class="flex" flat tile>
								<v-card-title class="teal">
									<strong class="subheading"
										>Get connected with us on social networks!</strong
									>

									<v-spacer></v-spacer>

									<v-btn
										v-for="icon in icons56"
										:key="icon"
										class="mx-4"
										dark
										icon
									>
										<v-icon size="24px">
											{{ icon }}
										</v-icon>
									</v-btn>
								</v-card-title>

								<v-card-text class="py-2 white--text text-center">
									{{ new Date().getFullYear() }} — <strong>Vuetify</strong>
								</v-card-text>
							</v-card>
						</v-footer>
					</template>
				</v-card-title>
				<v-card-title>
					57. v-form
				</v-card-title>
				<v-card-title>
					<template>
						<v-form v-model="valid57">
							<v-container>
								<v-row>
									<v-col cols="12" md="4">
										<v-text-field
											v-model="firstname57"
											:rules="nameRules57"
											:counter="10"
											label="First name"
											required
										></v-text-field>
									</v-col>

									<v-col cols="12" md="4">
										<v-text-field
											v-model="lastname57"
											:rules="nameRules57"
											:counter="10"
											label="Last name"
											required
										></v-text-field>
									</v-col>

									<v-col cols="12" md="4">
										<v-text-field
											v-model="email57"
											:rules="emailRules57"
											label="E-mail"
											required
										></v-text-field>
									</v-col>
								</v-row>
							</v-container>
						</v-form>
					</template>
				</v-card-title>
				<v-card-title>
					58. v-hover
				</v-card-title>
				<v-card-title>
					<template>
						<v-hover v-slot="{ hover }">
							<v-card class="mx-auto" color="grey lighten-4" max-width="600">
								<v-img
									:aspect-ratio="16 / 9"
									src="https://cdn.vuetifyjs.com/images/cards/kitchen.png"
								>
									<v-expand-transition>
										<div
											v-if="hover"
											class="d-flex transition-fast-in-fast-out orange darken-2 v-card--reveal text-h2 white--text"
											style="height: 100%;"
										>
											$14.99
										</div>
									</v-expand-transition>
								</v-img>
								<v-card-text class="pt-6" style="position: relative;">
									<v-btn
										absolute
										color="orange"
										class="white--text"
										fab
										large
										right
										top
									>
										<v-icon>mdi-cart</v-icon>
									</v-btn>
									<div class="font-weight-light grey--text text-h6 mb-2">
										For the perfect meal
									</div>
									<h3 class="text-h4 font-weight-light orange--text mb-2">
										QW cooking utensils
									</h3>
									<div class="font-weight-light text-h6 mb-2">
										Our Vintage kitchen utensils delight any chef.<br />
										Made of bamboo by hand
									</div>
								</v-card-text>
							</v-card>
						</v-hover>
					</template>
				</v-card-title>
				<v-card-title>
					59. v-icon
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<div>
								<v-btn class="ma-2" color="primary" dark>
									Accept
									<v-icon dark right>
										mdi-checkbox-marked-circle
									</v-icon>
								</v-btn>

								<v-btn class="ma-2" color="red" dark>
									Decline
									<v-icon dark right>
										mdi-cancel
									</v-icon>
								</v-btn>

								<v-btn class="ma-2" dark>
									<v-icon dark left> mdi-minus-circle </v-icon>Cancel
								</v-btn>
							</div>

							<div>
								<v-btn class="ma-2" color="orange darken-2" dark>
									<v-icon dark left> mdi-arrow-left </v-icon>Back
								</v-btn>

								<v-btn class="ma-2" color="purple" dark>
									<v-icon dark>
										mdi-wrench
									</v-icon>
								</v-btn>

								<v-btn class="ma-2" color="indigo" dark>
									<v-icon dark>
										mdi-cloud-upload
									</v-icon>
								</v-btn>
							</div>

							<div>
								<v-btn class="ma-2" text icon color="blue lighten-2">
									<v-icon>mdi-thumb-up</v-icon>
								</v-btn>

								<v-btn class="ma-2" text icon color="red lighten-2">
									<v-icon>mdi-thumb-down</v-icon>
								</v-btn>
							</div>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					60. v-img
				</v-card-title>
				<v-card-title>
					<template>
						<div class="d-flex flex-column justify-space-between align-center">
							<v-slider
								v-model="width60"
								class="align-self-stretch"
								min="200"
								max="500"
								step="1"
							></v-slider>

							<v-img
								:aspect-ratio="16 / 9"
								:width="width60"
								src="https://cdn.vuetifyjs.com/images/parallax/material.jpg"
							></v-img>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					61. v-input
				</v-card-title>
				<v-card-title>
					<template>
						<v-input
							error-count="2"
							:error-messages="['Fatal error', 'Another error']"
							error
							disabled
						>
							Input
						</v-input>
					</template>
				</v-card-title>
				<v-card-title>
					62. v-intersect (pass 안중요)
				</v-card-title>
				<v-card-title>
					63. v-item
				</v-card-title>
				<v-card-title>
					<template>
						<v-item-group mandatory>
							<v-container>
								<v-row>
									<v-col v-for="n in 3" :key="n" cols="12" md="4">
										<v-item v-slot="{ active, toggle }">
											<v-card
												:color="active ? 'primary' : ''"
												class="d-flex align-center"
												dark
												height="200"
												width="200"
												@click="toggle"
											>
												<v-scroll-y-transition>
													<div
														v-if="active"
														class="text-h2 flex-grow-1 text-center"
													>
														Active
													</div>
												</v-scroll-y-transition>
											</v-card>
										</v-item>
									</v-col>
								</v-row>
							</v-container>
						</v-item-group>
					</template>
				</v-card-title>
				<v-card-title>
					64. v-item-group (63번 참조)
				</v-card-title>
				<v-card-title>
					65. v-layout (55번 참조)
				</v-card-title>
				<v-card-title>
					65. v-lazy (pass 안중요)
				</v-card-title>
				<v-card-title>
					66. v-list
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" width="300">
							<v-list>
								<v-list-item>
									<v-list-item-icon>
										<v-icon>mdi-home</v-icon>
									</v-list-item-icon>

									<v-list-item-title>Home</v-list-item-title>
								</v-list-item>

								<v-list-group :value="true" prepend-icon="mdi-account-circle">
									<template v-slot:activator>
										<v-list-item-title>Users</v-list-item-title>
									</template>

									<v-list-group :value="true" no-action sub-group>
										<template v-slot:activator>
											<v-list-item-content>
												<v-list-item-title>Admin</v-list-item-title>
											</v-list-item-content>
										</template>

										<v-list-item
											v-for="([title, icon], i) in admins66"
											:key="i"
											link
										>
											<v-list-item-title v-text="title"></v-list-item-title>

											<v-list-item-icon>
												<v-icon v-text="icon"></v-icon>
											</v-list-item-icon>
										</v-list-item>
									</v-list-group>

									<v-list-group no-action sub-group>
										<template v-slot:activator>
											<v-list-item-content>
												<v-list-item-title>Actions</v-list-item-title>
											</v-list-item-content>
										</template>

										<v-list-item
											v-for="([title, icon], i) in cruds66"
											:key="i"
											link
										>
											<v-list-item-title v-text="title"></v-list-item-title>

											<v-list-item-icon>
												<v-icon v-text="icon"></v-icon>
											</v-list-item-icon>
										</v-list-item>
									</v-list-group>
								</v-list-group>
							</v-list>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					67. v-list-group (66번 참조)
				</v-card-title>
				<v-card-title>
					68. v-list-item (66번 참조)
				</v-card-title>
				<v-card-title>
					69. v-list-item-action
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" max-width="500">
							<v-list shaped>
								<v-list-item-group v-model="model69" multiple>
									<template v-for="(item, i) in items69">
										<v-divider v-if="!item" :key="`divider-${i}`"></v-divider>

										<v-list-item
											v-else
											:key="`item-${i}`"
											:value="item"
											active-class="deep-purple--text text--accent-4"
										>
											<template v-slot:default="{ active }">
												<v-list-item-content>
													<v-list-item-title v-text="item"></v-list-item-title>
												</v-list-item-content>

												<v-list-item-action>
													<v-checkbox
														:input-value="active"
														color="deep-purple accent-4"
													></v-checkbox>
												</v-list-item-action>
											</template>
										</v-list-item>
									</template>
								</v-list-item-group>
							</v-list>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					70. v-list-item-action-text
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" max-width="500">
							<v-toolbar color="pink" dark>
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>Inbox</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>

								<v-btn icon>
									<v-icon>mdi-checkbox-marked-circle</v-icon>
								</v-btn>
							</v-toolbar>

							<v-list two-line>
								<v-list-item-group
									v-model="selected70"
									active-class="pink--text"
									multiple
								>
									<template v-for="(item, index) in items70">
										<v-list-item :key="item.title">
											<template v-slot:default="{ active }">
												<v-list-item-content>
													<v-list-item-title
														v-text="item.title"
													></v-list-item-title>

													<v-list-item-subtitle
														class="text--primary"
														v-text="item.headline"
													></v-list-item-subtitle>

													<v-list-item-subtitle
														v-text="item.subtitle"
													></v-list-item-subtitle>
												</v-list-item-content>

												<v-list-item-action>
													<v-list-item-action-text
														v-text="item.action"
													></v-list-item-action-text>

													<v-icon v-if="!active" color="grey lighten-1">
														mdi-star-outline
													</v-icon>

													<v-icon v-else color="yellow darken-3">
														mdi-star
													</v-icon>
												</v-list-item-action>
											</template>
										</v-list-item>

										<v-divider
											v-if="index < items70.length - 1"
											:key="index"
										></v-divider>
									</template>
								</v-list-item-group>
							</v-list>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					71. v-list-item-avatar
				</v-card-title>
				<v-card-title>
					<template>
						<v-card max-width="500" class="mx-auto">
							<v-toolbar color="indigo" dark>
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>Inbox</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>

								<v-btn icon>
									<v-icon>mdi-dots-vertical</v-icon>
								</v-btn>
							</v-toolbar>
							<v-list>
								<v-list-item v-for="item in items71" :key="item.title">
									<v-list-item-icon>
										<v-icon v-if="item.icon" color="pink">
											mdi-star
										</v-icon>
									</v-list-item-icon>

									<v-list-item-content>
										<v-list-item-title v-text="item.title"></v-list-item-title>
									</v-list-item-content>

									<v-list-item-avatar>
										<v-img :src="item.avatar"></v-img>
									</v-list-item-avatar>
								</v-list-item>
							</v-list>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					72. v-list-item-content (71번 참조)
				</v-card-title>
				<v-card-title>
					73. v-list-item-group (70번 참조)
				</v-card-title>
				<v-card-title>
					74. v-list-item-icon (71번 참조)
				</v-card-title>
				<v-card-title>
					75. v-list-item-subtitle (70번 참조)
				</v-card-title>
				<v-card-title>
					76. v-list-item-title (71번 참조)
				</v-card-title>
				<v-card-title>
					77. v-main
				</v-card-title>
				<v-card-title>
					<!-- App.vue -->

					<v-app>
						<!-- <v-navigation-drawer app> -->
						<!-- -->
						<!-- </v-navigation-drawer>  -->

						<!-- <v-app-bar app>  -->
						<!-- -->
						<!-- </v-app-bar> -->

						<!-- Sizes your content based upon application components -->
						<v-main>
							<!-- Provides the application the proper gutter -->
							<v-container fluid>
								<!-- If using vue-router -->
								<router-view></router-view>
							</v-container>
						</v-main>

						<v-footer app>
							<!-- -->
						</v-footer>
					</v-app>
				</v-card-title>
				<v-card-title>
					78. v-menu
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-menu
								v-model="menu78"
								:close-on-content-click="false"
								:nudge-width="200"
								offset-x
							>
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="indigo" dark v-bind="attrs" v-on="on">
										Menu as Popover
									</v-btn>
								</template>

								<v-card>
									<v-list>
										<v-list-item>
											<v-list-item-avatar>
												<img
													src="https://cdn.vuetifyjs.com/images/john.jpg"
													alt="John"
												/>
											</v-list-item-avatar>

											<v-list-item-content>
												<v-list-item-title>John Leider</v-list-item-title>
												<v-list-item-subtitle
													>Founder of Vuetify</v-list-item-subtitle
												>
											</v-list-item-content>

											<v-list-item-action>
												<v-btn
													:class="fav78 ? 'red--text' : ''"
													icon
													@click="fav78 = !fav78"
												>
													<v-icon>mdi-heart</v-icon>
												</v-btn>
											</v-list-item-action>
										</v-list-item>
									</v-list>

									<v-divider></v-divider>

									<v-list>
										<v-list-item>
											<v-list-item-action>
												<v-switch v-model="message78" color="purple"></v-switch>
											</v-list-item-action>
											<v-list-item-title>Enable messages</v-list-item-title>
										</v-list-item>

										<v-list-item>
											<v-list-item-action>
												<v-switch v-model="hints78" color="purple"></v-switch>
											</v-list-item-action>
											<v-list-item-title>Enable hints</v-list-item-title>
										</v-list-item>
									</v-list>

									<v-card-actions>
										<v-spacer></v-spacer>

										<v-btn text @click="menu78 = false">
											Cancel
										</v-btn>
										<v-btn color="primary" text @click="menu78 = false">
											Save
										</v-btn>
									</v-card-actions>
								</v-card>
							</v-menu>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					79. v-menu-transition (78번 관련)
				</v-card-title>
				<v-card-title>
					80. v-mutate
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-text-field v-model="content80" label="Content"></v-text-field>
							<v-sheet v-mutate="onMutate">
								{{ content80 }}
							</v-sheet>
							Total mutations: {{ mutations80 }}
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					81. v-navigation-drawer
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="mx-auto" height="300" width="300">
							<v-navigation-drawer
								absolute
								dark
								src="https://cdn.vuetifyjs.com/images/backgrounds/bg-2.jpg"
								width="100%"
								permanent
							>
								<v-list>
									<v-list-item
										v-for="([icon, text], i) in items81"
										:key="i"
										link
									>
										<v-list-item-icon>
											<v-icon>{{ icon }}</v-icon>
										</v-list-item-icon>

										<v-list-item-content>
											<v-list-item-title>{{ text }}</v-list-item-title>
										</v-list-item-content>
									</v-list-item>
								</v-list>
							</v-navigation-drawer>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					82. v-otp-input (안 먹힌다.)
				</v-card-title>
				<v-card-title>
					<template>
						<div class="ma-auto" style="max-width: 260px">
							<v-otp-input
								v-model="otp82"
								type="password"
								length="5"
								dark
							></v-otp-input>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					83. v-overflow-btn
				</v-card-title>
				<v-card-title>
					<template>
						<v-container id="dropdown-example-1">
							<v-overflow-btn
								class="my-2"
								:items="dropdown_font83"
								menu-props="top"
								label="Overflow Btn w/ hint"
								hint="Select font"
								target="#dropdown-example-1"
							></v-overflow-btn>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					84. v-overlay
				</v-card-title>
				<v-card-title>
					<template>
						<v-row align="center" justify="center">
							<v-card height="300" width="250">
								<v-row justify="center">
									<v-btn
										color="success"
										class="mt-12"
										@click="overlay84 = !overlay84"
									>
										Show Overlay
									</v-btn>

									<v-overlay :absolute="absolute84" :value="overlay84">
										<v-btn color="success" @click="overlay84 = false">
											Hide Overlay
										</v-btn>
									</v-overlay>
								</v-row>
							</v-card>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					85. v-pagination
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-pagination v-model="page85" :length="6"></v-pagination>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					86. v-parallax
				</v-card-title>
				<v-card-title>
					<template>
						<v-parallax
							dark
							src="https://cdn.vuetifyjs.com/images/backgrounds/vbanner.jpg"
						>
							<v-row align="center" justify="center">
								<v-col class="text-center" cols="12">
									<h1 class="text-h4 font-weight-thin mb-4">
										Vuetify
									</h1>
									<h4 class="subheading">
										Build your application today!
									</h4>
								</v-col>
							</v-row>
						</v-parallax>
					</template>
				</v-card-title>
				<v-card-title>
					87. v-progress-circular
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-progress-circular
								:rotate="360"
								:size="100"
								:width="15"
								:value="value87"
								color="teal"
							>
								{{ value87 }}
							</v-progress-circular>

							<v-progress-circular
								:rotate="-90"
								:size="100"
								:width="15"
								:value="value87"
								color="primary"
							>
								{{ value87 }}
							</v-progress-circular>

							<v-progress-circular
								:rotate="90"
								:size="100"
								:width="15"
								:value="value87"
								color="red"
							>
								{{ value87 }}
							</v-progress-circular>

							<v-progress-circular
								:rotate="180"
								:size="100"
								:width="15"
								:value="value87"
								color="pink"
							>
								{{ value87 }}
							</v-progress-circular>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					88. v-progress-linear
				</v-card-title>
				<v-card-title>
					<template>
						<v-progress-linear
							v-model="power"
							color="amber"
							height="25"
						></v-progress-linear>

						<br />

						<v-progress-linear v-model="skill" color="blue-grey" height="25">
							<template v-slot:default="{ value }">
								<strong>{{ Math.ceil(value) }}%</strong>
							</template>
						</v-progress-linear>

						<br />

						<v-progress-linear v-model="knowledge" height="25">
							<strong>{{ Math.ceil(knowledge) }}%</strong>
						</v-progress-linear>
					</template>
				</v-card-title>
				<v-card-title>
					89. v-radio
				</v-card-title>
				<v-card-title>
					<template>
						<v-container class="px-0" fluid>
							<v-radio-group v-model="radioGroup">
								<v-radio
									v-for="n in 3"
									:key="n"
									:label="`Radio ${n}`"
									:value="n"
								></v-radio>
							</v-radio-group>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					90. v-radio-group (89번참조)
				</v-card-title>
				<v-card-title>
					91. v-range-slider
				</v-card-title>
				<v-card-title>
					<template>
						<v-card flat color="transparent">
							<v-subheader>Min and max range slider</v-subheader>

							<v-card-text>
								<v-row>
									<v-col class="px-4">
										<v-range-slider
											v-model="range91"
											:max="max91"
											:min="min91"
											style="width: 500px"
											hide-details
											class="align-center"
										>
											<template v-slot:prepend>
												<v-text-field
													:value="range91[0]"
													class="mt-0 pt-0"
													hide-details
													single-line
													type="number"
													style="width: 60px"
													@change="$set(range91, 0, $event)"
												></v-text-field>
											</template>
											<template v-slot:append>
												<v-text-field
													:value="range91[1]"
													class="mt-0 pt-0"
													hide-details
													single-line
													type="number"
													style="width: 60px"
													@change="$set(range91, 1, $event)"
												></v-text-field>
											</template>
										</v-range-slider>
									</v-col>
								</v-row>
							</v-card-text>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					92. v-rating
				</v-card-title>
				<v-card-title>
					<template>
						<v-card class="elevation-16 mx-auto" width="300">
							<v-card-title class="text-h5">
								Rate Our Framework
							</v-card-title>
							<v-card-text>
								If you enjoy using Vuetify, please take a few seconds to rate
								your experience with the framework. It really helps!

								<div class="text-center mt-12">
									<v-rating
										v-model="rating92"
										color="yellow darken-3"
										background-color="grey darken-1"
										empty-icon="$ratingFull"
										half-increments
										hover
										large
									></v-rating>
								</div>
							</v-card-text>
							<v-divider></v-divider>
							<v-card-actions class="justify-space-between">
								<v-btn text>
									No Thanks
								</v-btn>
								<v-btn color="primary" text>
									Rate Now
								</v-btn>
							</v-card-actions>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					93. v-resize
				</v-card-title>
				<v-card-title>
					<template>
						<v-row v-resize="onResize93" align="center" justify="center">
							<v-subheader>Window Size</v-subheader>
							{{ windowSize }}
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					94. v-responsive
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-card>
								<v-responsive :aspect-ratio="16 / 9">
									<v-card-text>
										This card will always be 16:9 (unless you put more stuff in
										it)
									</v-card-text>
								</v-responsive>
							</v-card>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					95. v-ripple (블럭형태로 만듬)
				</v-card-title>
				<v-card-title>
					<template>
						<div v-ripple class="text-center elevation-2 pa-12 text-h5">
							HTML element with v-ripple
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					96. v-row (91번 참조)
				</v-card-title>
				<v-card-title>
					97. v-scale-transition
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-menu transition="scale-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn dark color="primary" v-bind="attrs" v-on="on">
										Scale Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n">
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					98. v-scroll
				</v-card-title>
				<v-card-title>
					<template>
						<v-card
							v-scroll.self="onScroll98"
							class="overflow-y-auto"
							max-height="400"
						>
							<v-banner class="justify-center text-h5 font-weight-light" sticky>
								Scroll Me - Method invoked

								<span class="font-weight-bold" v-text="scrollInvoked98"></span>

								times
							</v-banner>

							<v-card-text>
								<div v-for="n in 12" :key="n" class="mb-4">
									Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi
									commodi earum tenetur. Asperiores dolorem placeat ab nobis
									iusto culpa, autem molestias molestiae quidem pariatur.
									Debitis beatae expedita nam facere perspiciatis. Lorem ipsum
									dolor sit amet consectetur adipisicing elit. Repellendus
									ducimus cupiditate rerum officiis consequuntur laborum
									doloremque quaerat ipsa voluptates, nobis nam quis nulla ullam
									at corporis, similique ratione quasi illo!
								</div>
							</v-card-text>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					99. v-scroll-x-reverse-transition
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-menu transition="scroll-x-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" class="ma-2" v-bind="attrs" v-on="on">
										Scroll X Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>

							<div class="mx-4 hidden-sm-and-down"></div>

							<v-menu transition="scroll-x-reverse-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn
										color="secondary"
										class="ma-2"
										v-bind="attrs"
										v-on="on"
									>
										Scroll X Reverse Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					100. v-scroll-x-transition (99번 참조)
				</v-card-title>
				<v-card-title>
					101. v-scroll-y-reverse-transition
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-menu transition="scroll-y-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" class="ma-2" v-bind="attrs" v-on="on">
										Scroll Y Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>

							<div class="mx-4 hidden-sm-and-down"></div>

							<v-menu transition="scroll-y-reverse-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn
										color="secondary"
										class="ma-2"
										v-bind="attrs"
										v-on="on"
									>
										Scroll Y Reverse Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					102. v-scroll-y-transition (101번 참조)
				</v-card-title>
				<v-card-title>
					103. v-select
				</v-card-title>
				<v-card-title>
					<template>
						<v-container fluid>
							<v-row align="center">
								<v-col class="d-flex" cols="12" sm="6">
									<v-select :items="items103" label="Standard"></v-select>
								</v-col>

								<v-col class="d-flex" cols="12" sm="6">
									<v-select
										:items="items103"
										filled
										label="Filled style"
									></v-select>
								</v-col>

								<v-col class="d-flex" cols="12" sm="6">
									<v-select
										:items="items103"
										label="Outlined style"
										outlined
									></v-select>
								</v-col>

								<v-col class="d-flex" cols="12" sm="6">
									<v-select
										:items="items103"
										label="Solo field"
										solo
									></v-select>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					104. v-sheet
				</v-card-title>
				<v-card-title>
					<template>
						<v-container>
							<v-row justify="space-around">
								<v-col
									v-for="elevation in elevations104"
									:key="elevation"
									cols="12"
									md="4"
								>
									<v-sheet class="pa-12" color="grey lighten-3">
										<v-sheet
											:elevation="elevation"
											class="mx-auto"
											height="100"
											width="100"
										></v-sheet>
									</v-sheet>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					105. v-simple-checkbox
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-data-table
								:headers="headers105"
								:items="desserts105"
								class="elevation-1"
							>
								<template v-slot:item.glutenfree="{ item }">
									<v-simple-checkbox
										v-model="item.glutenfree"
										disabled
									></v-simple-checkbox>
								</template>
							</v-data-table>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					106. v-simple-table
				</v-card-title>
				<v-card-title>
					<template>
						<v-simple-table>
							<template v-slot:default>
								<thead>
									<tr>
										<th class="text-left">
											Name
										</th>
										<th class="text-left">
											Calories
										</th>
									</tr>
								</thead>
								<tbody>
									<tr v-for="item in desserts106" :key="item.name">
										<td>{{ item.name }}</td>
										<td>{{ item.calories }}</td>
									</tr>
								</tbody>
							</template>
						</v-simple-table>
					</template>
				</v-card-title>
				<v-card-title>
					107. v-skeleton-loader
				</v-card-title>
				<v-card-title>
					<template>
						<v-sheet
							:color="`grey ${theme107.isDark ? 'darken-2' : 'lighten-4'}`"
							class="pa-3"
						>
							<v-skeleton-loader
								class="mx-auto"
								width="300"
								max-width="300"
								type="card"
							></v-skeleton-loader>
						</v-sheet>
					</template>
				</v-card-title>
				<v-card-title>
					108. v-slide-group
				</v-card-title>
				<v-card-title>
					<template>
						<v-sheet class="mx-auto" elevation="8" max-width="800">
							<v-slide-group
								v-model="model108"
								class="pa-4"
								mandatory
								show-arrows
							>
								<v-slide-item
									v-for="n in 15"
									:key="n"
									v-slot="{ active, toggle }"
								>
									<v-card
										:color="active ? 'primary' : 'grey lighten-1'"
										class="ma-4"
										height="200"
										width="100"
										@click="toggle"
									>
										<v-row class="fill-height" align="center" justify="center">
											<v-scale-transition>
												<v-icon
													v-if="active"
													color="white"
													size="48"
													v-text="'mdi-close-circle-outline'"
												></v-icon>
											</v-scale-transition>
										</v-row>
									</v-card>
								</v-slide-item>
							</v-slide-group>
						</v-sheet>
					</template>
				</v-card-title>
				<v-card-title>
					109. v-slide-item (108번 참조)
				</v-card-title>
				<v-card-title>
					110. v-slide-x-reverse-transition
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-menu transition="slide-x-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" class="ma-2" v-bind="attrs" v-on="on">
										Slide X Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>

							<div class="mx-4 hidden-sm-and-down"></div>

							<v-menu transition="slide-x-reverse-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn
										color="secondary"
										class="ma-2"
										v-bind="attrs"
										v-on="on"
									>
										Slide X Reverse Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					111. v-slide-x-transition (110번 참조)
				</v-card-title>
				<v-card-title>
					112. v-slide-y-reverse-transition
				</v-card-title>
				<v-card-title>
					<template>
						<v-row justify="center">
							<v-menu transition="slide-y-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" class="ma-2" v-bind="attrs" v-on="on">
										Slide Y Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>

							<div class="mx-4 hidden-sm-and-down"></div>

							<v-menu transition="slide-y-reverse-transition">
								<template v-slot:activator="{ on, attrs }">
									<v-btn
										color="secondary"
										class="ma-2"
										v-bind="attrs"
										v-on="on"
									>
										Slide Y Reverse Transition
									</v-btn>
								</template>
								<v-list>
									<v-list-item v-for="n in 5" :key="n" link>
										<v-list-item-title v-text="'Item ' + n"></v-list-item-title>
									</v-list-item>
								</v-list>
							</v-menu>
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					113. v-slide-y-transition (112번 참조)
				</v-card-title>
				<v-card-title>
					114. v-slider
				</v-card-title>
				<v-card-title>
					<template>
						<v-card flat color="transparent">
							<v-subheader>Media volume</v-subheader>
							<v-card-text>
								<v-slider
									v-model="media"
									prepend-icon="mdi-volume-high"
									thumb-label
									ticks
									step="10"
								></v-slider>
							</v-card-text>

							<v-subheader>Alarm volume</v-subheader>

							<v-card-text>
								<v-slider
									v-model="alarm"
									append-icon="mdi-alarm"
									thumb-label
									ticks
									step="10"
								></v-slider>
							</v-card-text>

							<v-subheader>Icon click callback</v-subheader>

							<v-card-text>
								<v-slider
									v-model="zoom"
									append-icon="mdi-magnify-plus-outline"
									prepend-icon="mdi-magnify-minus-outline"
									thumb-label
									ticks
									step="10"
									@click:append="zoomIn"
									@click:prepend="zoomOut"
								></v-slider>
							</v-card-text>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					115. v-snackbar
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center">
							<v-btn dark color="orange darken-2" @click="snackbar115 = true">
								Open Snackbar
							</v-btn>

							<v-snackbar v-model="snackbar115" :timeout="timeout115">
								{{ text115 }}

								<template v-slot:action="{ attrs }">
									<v-btn
										color="blue"
										text
										v-bind="attrs"
										@click="snackbar115 = false"
									>
										Close
									</v-btn>
								</template>
							</v-snackbar>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					116. v-spacer
				</v-card-title>
				<v-card-title>
					<template>
						<v-container class="grey lighten-5">
							<v-row>
								<v-col>
									<v-card class="pa-2" outlined tile>
										.col
									</v-card>
								</v-col>

								<v-spacer></v-spacer>

								<v-col>
									<v-card class="pa-2" outlined tile>
										.col
									</v-card>
								</v-col>
							</v-row>

							<v-row>
								<v-col cols="auto" lg="3">
									<v-card class="pa-2" outlined tile>
										.col-auto
									</v-card>
								</v-col>

								<v-spacer></v-spacer>

								<v-col>
									<v-card class="pa-2" outlined tile>
										.col
									</v-card>
								</v-col>

								<v-spacer></v-spacer>

								<v-col md="5">
									<v-card class="pa-2" cols="auto" outlined tile>
										.col-md-5
									</v-card>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					117. v-sparkline
				</v-card-title>
				<v-card-title>
					<template>
						<v-card
							class="mx-auto text-center"
							color="green"
							dark
							max-width="600"
						>
							<v-card-text>
								<v-sheet color="rgba(0, 0, 0, .12)">
									<v-sparkline
										:value="value117"
										color="rgba(255, 255, 255, .7)"
										height="100"
										padding="24"
										stroke-linecap="round"
										smooth
									>
										<template v-slot:label="item"> ${{ item.value }} </template>
									</v-sparkline>
								</v-sheet>
							</v-card-text>

							<v-card-text>
								<div class="text-h4 font-weight-thin">
									Sales Last 24h
								</div>
							</v-card-text>

							<v-divider></v-divider>

							<v-card-actions class="justify-center">
								<v-btn block text>
									Go to Report
								</v-btn>
							</v-card-actions>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					118. v-speed-dial
				</v-card-title>
				<v-card-title>
					<template>
						<v-container fluid>
							<v-row>
								<v-col cols="12" sm="12" md="6" offset-md="3">
									<v-card>
										<v-toolbar extended>
											<v-app-bar-nav-icon></v-app-bar-nav-icon>
											<template v-slot:extension>
												<v-fab-transition>
													<v-btn
														v-show="!hidden118"
														color="pink"
														fab
														dark
														small
														absolute
														bottom
														left
													>
														<v-icon>mdi-plus</v-icon>
													</v-btn>
												</v-fab-transition>
											</template>
										</v-toolbar>
										<v-card-text
											style="height: 300px;"
											class="grey lighten-5 text-center"
										>
											<v-btn color="primary" @click="hidden118 = !hidden118">
												{{ hidden118 ? 'Show' : 'Hide' }}
											</v-btn>
										</v-card-text>
										<v-card-text style="height: 100px; position: relative">
											<v-fab-transition>
												<v-btn
													v-show="!hidden118"
													color="pink"
													dark
													absolute
													top
													right
													fab
												>
													<v-icon>mdi-plus</v-icon>
												</v-btn>
											</v-fab-transition>
										</v-card-text>
									</v-card>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					119. v-slide-x-transition (110번 참조)
				</v-card-title>
				<v-card-title>
					<template>
						<v-stepper v-model="e119">
							<v-stepper-header>
								<v-stepper-step :complete="e119 > 1" step="1">
									Name of step 1
								</v-stepper-step>

								<v-divider></v-divider>

								<v-stepper-step :complete="e119 > 2" step="2">
									Name of step 2
								</v-stepper-step>

								<v-divider></v-divider>

								<v-stepper-step step="3">
									Name of step 3
								</v-stepper-step>
							</v-stepper-header>

							<v-stepper-items>
								<v-stepper-content step="1">
									<v-card
										class="mb-12"
										color="grey lighten-1"
										height="200px"
									></v-card>

									<v-btn color="primary" @click="e119 = 2">
										Continue
									</v-btn>

									<v-btn text>
										Cancel
									</v-btn>
								</v-stepper-content>

								<v-stepper-content step="2">
									<v-card
										class="mb-12"
										color="grey lighten-1"
										height="200px"
									></v-card>

									<v-btn color="primary" @click="e119 = 3">
										Continue
									</v-btn>

									<v-btn text>
										Cancel
									</v-btn>
								</v-stepper-content>

								<v-stepper-content step="3">
									<v-card
										class="mb-12"
										color="grey lighten-1"
										height="200px"
									></v-card>

									<v-btn color="primary" @click="e119 = 1">
										Continue
									</v-btn>

									<v-btn text>
										Cancel
									</v-btn>
								</v-stepper-content>
							</v-stepper-items>
						</v-stepper>
					</template>
				</v-card-title>
				<v-card-title>
					120. v-stepper-content (119번 참조)
				</v-card-title>
				<v-card-title>
					121. v-subheader
				</v-card-title>
				<v-card-title>
					<template>
						<v-col cols="12" sm="6" offset-sm="3">
							<v-card>
								<v-subheader :inset="inset121">
									Subheader
								</v-subheader>

								<v-list>
									<template v-for="(item, index) in items121">
										<v-list-item v-if="item.action" :key="item.title">
											<v-list-item-action>
												<v-icon>{{ item.action }}</v-icon>
											</v-list-item-action>

											<v-list-item-content>
												<v-list-item-title>{{ item.title }}</v-list-item-title>
											</v-list-item-content>
										</v-list-item>

										<v-divider
											v-else-if="item.divider"
											:key="index"
											:inset="inset"
										></v-divider>
									</template>
								</v-list>
							</v-card>
						</v-col>
					</template>
				</v-card-title>
				<v-card-title>
					122. v-stepper-items (119번 참조)
				</v-card-title>
				<v-card-title>
					<template>
						<v-sheet class="pa-5">
							<v-switch
								v-model="switch1"
								inset
								:label="`Switch 1: ${switch1.toString()}`"
							></v-switch>
							<v-switch
								v-model="switch2"
								inset
								:label="`Switch 2: ${switch2.toString()}`"
							></v-switch>
						</v-sheet>
					</template>
				</v-card-title>
				<v-card-title>
					123. v-system-bar
				</v-card-title>
				<v-card-title>
					<template>
						<div>
							<v-system-bar dark color="primary">
								<v-spacer></v-spacer>
								<v-icon>mdi-wifi-strength-4</v-icon>
								<v-icon>mdi-signal-cellular-outline</v-icon>
								<v-icon>mdi-battery</v-icon>
								<span>12:30</span>
							</v-system-bar>
							<br />
							<v-system-bar dark color="red lighten-2">
								<v-spacer></v-spacer>
								<v-icon>mdi-wifi-strength-4</v-icon>
								<v-icon>mdi-signal-cellular-outline</v-icon>
								<v-icon>mdi-battery</v-icon>
								<span>12:30</span>
							</v-system-bar>
							<br />
							<v-system-bar dark color="indigo darken-2">
								<v-spacer></v-spacer>
								<v-icon>mdi-wifi-strength-4</v-icon>
								<v-icon>mdi-signal-cellular-outline</v-icon>
								<v-icon>mdi-battery</v-icon>
								<span>12:30</span>
							</v-system-bar>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					124. v-tab
				</v-card-title>
				<v-card-title>
					<template>
						<v-card>
							<v-toolbar color="cyan" dark flat>
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>Your Dashboard</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>

								<v-btn icon>
									<v-icon>mdi-dots-vertical</v-icon>
								</v-btn>

								<template v-slot:extension>
									<v-tabs v-model="tab124" align-with-title>
										<v-tabs-slider color="yellow"></v-tabs-slider>

										<v-tab v-for="item in items124" :key="item">
											{{ item }}
										</v-tab>
									</v-tabs>
								</template>
							</v-toolbar>

							<v-tabs-items v-model="tab124">
								<v-tab-item v-for="item in items124" :key="item">
									<v-card flat>
										<v-card-text v-text="text124"></v-card-text>
									</v-card>
								</v-tab-item>
							</v-tabs-items>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					125. v-tab-item (124번 참조)
				</v-card-title>
				<v-card-title>
					126. v-tab-reverse-transition (PASS)
				</v-card-title>
				<v-card-title>
					127. v-tab-transition (PASS)
				</v-card-title>
				<v-card-title>
					128. v-tabs (124번 참조)
				</v-card-title>
				<v-card-title>
					129. v-tabs-items (124번 참조)
				</v-card-title>
				<v-card-title>
					130. v-tabs-slider (124번 참조)
				</v-card-title>
				<v-card-title>
					131. v-text-field
				</v-card-title>
				<v-card-title>
					<template>
						<v-form>
							<v-container>
								<v-row>
									<v-col cols="12" sm="6" md="3">
										<v-text-field label="Regular"></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field
											label="Regular"
											placeholder="Placeholder"
										></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field label="Solo" solo></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field
											label="Solo"
											placeholder="Placeholder"
											solo
										></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field label="Filled" filled></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field
											label="Filled"
											placeholder="Placeholder"
											filled
										></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field label="Outlined" outlined></v-text-field>
									</v-col>

									<v-col cols="12" sm="6" md="3">
										<v-text-field
											label="Outlined"
											placeholder="Placeholder"
											outlined
										></v-text-field>
									</v-col>
								</v-row>
							</v-container>
						</v-form>
					</template>
				</v-card-title>
				<v-card-title>
					132. v-textarea
				</v-card-title>
				<v-card-title>
					<template>
						<v-container fluid>
							<v-row>
								<v-col cols="12" md="6">
									<v-textarea
										name="input-7-1"
										label="Default style"
										value="The Woodman set to work at once, and so sharp was his axe that the tree was soon chopped nearly through."
										hint="Hint text"
									></v-textarea>
								</v-col>
								<v-col cols="12" md="6">
									<v-textarea
										solo
										name="input-7-4"
										label="Solo textarea"
									></v-textarea>
								</v-col>
								<v-col cols="12" md="6">
									<v-textarea
										filled
										name="input-7-4"
										label="Filled textarea"
										value="The Woodman set to work at once, and so sharp was his axe that the tree was soon chopped nearly through."
									></v-textarea>
								</v-col>
								<v-col cols="12" md="6">
									<v-textarea
										outlined
										name="input-7-4"
										label="Outlined textarea"
										value="The Woodman set to work at once, and so sharp was his axe that the tree was soon chopped nearly through."
									></v-textarea>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					133. v-theme-provider
				</v-card-title>
				<v-card-title>
					<template>
						<v-card dark flat>
							<v-toolbar flat height="72">
								<v-switch
									v-model="$vuetify.theme.dark"
									hint="This toggles the global state of the Vuetify theme"
									inset
									label="Vuetify Theme Dark"
									persistent-hint
								></v-switch>
							</v-toolbar>

							<v-card-text>
								<v-list>
									<v-subheader>I inherit dark from my parent</v-subheader>

									<v-list-item>
										<v-list-item-title>One</v-list-item-title>
									</v-list-item>

									<v-list-item>
										<v-list-item-title>Two</v-list-item-title>
									</v-list-item>

									<v-list-item>
										<v-list-item-title>Three</v-list-item-title>
									</v-list-item>
								</v-list>

								<v-divider class="mb-y"></v-divider>

								<v-theme-provider root>
									<v-list rounded="b">
										<v-subheader>
											<span>I inherit from the root</span>

											<strong>&nbsp;$vuetify.theme.dark</strong>
										</v-subheader>

										<v-list-item>
											<v-list-item-title>One</v-list-item-title>
										</v-list-item>

										<v-list-item>
											<v-list-item-title>Two</v-list-item-title>
										</v-list-item>

										<v-list-item>
											<v-list-item-title>Three</v-list-item-title>
										</v-list-item>
									</v-list>
								</v-theme-provider>
							</v-card-text>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					134. v-time-picker (Pass)
				</v-card-title>
				<v-card-title>
					135. v-timeline
				</v-card-title>
				<v-card-title>
					<template>
						<v-timeline :dense="$vuetify.breakpoint.smAndDown">
							<v-timeline-item color="purple lighten-2" fill-dot right>
								<v-card>
									<v-card-title class="purple lighten-2">
										<v-icon dark size="42" class="mr-4">
											mdi-magnify
										</v-icon>
										<h2 class="text-h4 white--text font-weight-light">
											Title 1
										</h2>
									</v-card-title>
									<v-container>
										<v-row>
											<v-col cols="12" md="10">
												Lorem ipsum dolor sit amet, no nam oblique veritus.
												Commune scaevola imperdiet nec ut, sed euismod convenire
												principes at. Est et nobis iisque percipit.
											</v-col>
											<v-col class="hidden-sm-and-down text-right" md="2">
												<v-icon size="64">
													mdi-calendar-text
												</v-icon>
											</v-col>
										</v-row>
									</v-container>
								</v-card>
							</v-timeline-item>

							<v-timeline-item color="amber lighten-1" fill-dot left small>
								<v-card>
									<v-card-title class="amber lighten-1 justify-end">
										<h2 class="text-h4 mr-4 white--text font-weight-light">
											Title 2
										</h2>
										<v-icon dark size="42">
											mdi-home-outline
										</v-icon>
									</v-card-title>
									<v-container>
										<v-row>
											<v-col cols="12" md="8">
												Lorem ipsum dolor sit amet, no nam oblique veritus.
												Commune scaevola imperdiet nec ut, sed euismod convenire
												principes at. Est et nobis iisque percipit.
											</v-col>
											<v-col cols="12" md="4">
												Lorem ipsum dolor sit amet, no nam oblique veritus.
											</v-col>
										</v-row>
									</v-container>
								</v-card>
							</v-timeline-item>

							<v-timeline-item color="cyan lighten-1" fill-dot right>
								<v-card>
									<v-card-title class="cyan lighten-1">
										<v-icon class="mr-4" dark size="42">
											mdi-email-outline
										</v-icon>
										<h2 class="text-h4 white--text font-weight-light">
											Title 3
										</h2>
									</v-card-title>
									<v-container>
										<v-row>
											<v-col v-for="n in 3" :key="n" cols="12" md="4">
												Lorem ipsum dolor sit amet, no nam oblique veritus no
												nam oblique.
											</v-col>
										</v-row>
									</v-container>
								</v-card>
							</v-timeline-item>

							<v-timeline-item color="red lighten-1" fill-dot left small>
								<v-card>
									<v-card-title class="red lighten-1 justify-end">
										<h2 class="text-h4 mr-4 white--text font-weight-light">
											Title 4
										</h2>
										<v-icon dark size="42">
											mdi-account-multiple-outline
										</v-icon>
									</v-card-title>
									<v-container>
										<v-row>
											<v-col class="hidden-sm-and-down" md="2">
												<v-icon size="64">
													mdi-server-network
												</v-icon>
											</v-col>
											<v-col cols="12" md="10">
												Lorem ipsum dolor sit amet, no nam oblique veritus.
												Commune scaevola imperdiet nec ut, sed euismod convenire
												principes at. Est et nobis iisque percipit, an vim zril
												disputando voluptatibus.
											</v-col>
										</v-row>
									</v-container>
								</v-card>
							</v-timeline-item>

							<v-timeline-item color="green lighten-1" fill-dot right>
								<v-card>
									<v-card-title class="green lighten-1">
										<v-icon class="mr-4" dark size="42">
											mdi-phone-in-talk
										</v-icon>
										<h2 class="text-h4 white--text font-weight-light">
											Title 5
										</h2>
									</v-card-title>
									<v-container>
										<v-row>
											<v-col>
												Lorem ipsum dolor sit amet, no nam oblique veritus.
												Commune scaevola imperdiet nec ut, sed euismod convenire
												principes at. Est et nobis iisque percipit, an vim zril
												disputando voluptatibus, vix an salutandi sententiae.
											</v-col>
										</v-row>
									</v-container>
								</v-card>
							</v-timeline-item>
						</v-timeline>
					</template>
				</v-card-title>
				<v-card-title>
					136. v-timeline-item (135번 참조)
				</v-card-title>
				<v-card-title>
					137. v-toolbar
				</v-card-title>
				<v-card-title>
					<template>
						<v-card color="grey lighten-4" flat height="200px" tile>
							<v-toolbar prominent extended>
								<v-app-bar-nav-icon></v-app-bar-nav-icon>

								<v-toolbar-title>Title</v-toolbar-title>

								<v-spacer></v-spacer>

								<v-btn icon>
									<v-icon>mdi-magnify</v-icon>
								</v-btn>

								<v-btn icon>
									<v-icon>mdi-heart</v-icon>
								</v-btn>

								<v-btn icon>
									<v-icon>mdi-dots-vertical</v-icon>
								</v-btn>
							</v-toolbar>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					138. v-toolbar-items
				</v-card-title>
				<v-card-title>
					<template>
						<v-container>
							<v-row class="text-center">
								<v-col col="12">
									<v-card color="grey lighten-4" flat height="200px" tile>
										<v-toolbar prominent extended>
											<v-app-bar-nav-icon></v-app-bar-nav-icon>
											<v-toolbar-title>Title</v-toolbar-title>
											<v-spacer></v-spacer>
											<v-toolbar-items>
												<v-btn
													depressed="depressed"
													flat="flat"
													@click="navigateToDefaultEdit"
													color="primary"
													>Default</v-btn
												>
											</v-toolbar-items>
											<v-btn icon>
												<v-icon>mdi-magnify</v-icon>
											</v-btn>
											<v-btn icon>
												<v-icon>mdi-heart</v-icon>
											</v-btn>
											<v-btn icon>
												<v-icon>mdi-dots-vertical</v-icon>
											</v-btn>
										</v-toolbar>
									</v-card>
								</v-col>
							</v-row>
						</v-container>
					</template>
				</v-card-title>
				<v-card-title>
					139. v-toolbar-title (138번 참조)
				</v-card-title>
				<v-card-title>
					140. v-tooltip
				</v-card-title>
				<v-card-title>
					<template>
						<div class="text-center d-flex align-center justify-space-around">
							<v-tooltip left>
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" dark v-bind="attrs" v-on="on">
										Left
									</v-btn>
								</template>
								<span>Left tooltip</span>
							</v-tooltip>

							<v-tooltip top>
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" dark v-bind="attrs" v-on="on">
										Top
									</v-btn>
								</template>
								<span>Top tooltip</span>
							</v-tooltip>

							<v-tooltip bottom>
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" dark v-bind="attrs" v-on="on">
										Bottom
									</v-btn>
								</template>
								<span>Bottom tooltip</span>
							</v-tooltip>

							<v-tooltip right>
								<template v-slot:activator="{ on, attrs }">
									<v-btn color="primary" dark v-bind="attrs" v-on="on">
										Right
									</v-btn>
								</template>
								<span>Right tooltip</span>
							</v-tooltip>
						</div>
					</template>
				</v-card-title>
				<v-card-title>
					141. v-touch
				</v-card-title>
				<v-card-title>
					<template>
						<v-row
							v-touch="{
								left: () => swipe('Left'),
								right: () => swipe('Right'),
								up: () => swipe('Up'),
								down: () => swipe('Down'),
							}"
							align="center"
							class="grey lighten-2"
							justify="center"
							style="height: 500px"
						>
							<v-subheader>Swipe Direction</v-subheader>
							{{ swipeDirection }}
						</v-row>
					</template>
				</v-card-title>
				<v-card-title>
					142. v-treeview (깃 반영)
				</v-card-title>
				<v-card-title>
					<template>
						<v-treeview activatable :items="items142"></v-treeview>
					</template>
				</v-card-title>
				<v-card-title>
					143. v-virtual-scroll (Pass)
				</v-card-title>
				<v-card-title>
					144. v-window
				</v-card-title>
				<v-card-title>
					<template>
						<v-card flat tile>
							<v-window v-model="onboarding144" reverse>
								<v-window-item v-for="n in length144" :key="`card-${n}`">
									<v-card color="grey" height="200">
										<v-row class="fill-height" align="center" justify="center">
											<h1 style="font-size: 5rem;" class="white--text">
												Slide {{ n }}
											</h1>
										</v-row>
									</v-card>
								</v-window-item>
							</v-window>

							<v-card-actions class="justify-space-between">
								<v-btn text @click="prev">
									<v-icon>mdi-chevron-left</v-icon>
								</v-btn>
								<v-item-group
									v-model="onboarding144"
									class="text-center"
									mandatory
								>
									<v-item
										v-for="n in length144"
										:key="`btn-${n}`"
										v-slot="{ active, toggle }"
									>
										<v-btn :input-value="active" icon @click="toggle">
											<v-icon>mdi-record</v-icon>
										</v-btn>
									</v-item>
								</v-item-group>
								<v-btn text @click="next">
									<v-icon>mdi-chevron-right</v-icon>
								</v-btn>
							</v-card-actions>
						</v-card>
					</template>
				</v-card-title>
				<v-card-title>
					145. v-window-item (144번 참조)
				</v-card-title>
			</v-card>
		</v-container>
	</div>
</template>

<script>
// @ is an alias to /src

export default {
	// 이거 파일 이름이 Tag.vue 이니깐 name: 'Tag' 임
	name: 'Tag',
	components: {},
	data() {
		return {
			length144: 3,
			onboarding144: 0,
			items142: [
				{
					id: 1,
					name: 'Applications :',
					children: [
						{ id: 2, name: 'Calendar : app' },
						{ id: 3, name: 'Chrome : app' },
						{ id: 4, name: 'Webstorm : app' },
					],
				},
				{
					id: 5,
					name: 'Documents :',
					children: [
						{
							id: 6,
							name: 'vuetify :',
							children: [
								{
									id: 7,
									name: 'src :',
									children: [
										{ id: 8, name: 'index : ts' },
										{ id: 9, name: 'bootstrap : ts' },
									],
								},
							],
						},
						{
							id: 10,
							name: 'material2 :',
							children: [
								{
									id: 11,
									name: 'src :',
									children: [
										{ id: 12, name: 'v-btn : ts' },
										{ id: 13, name: 'v-card : ts' },
										{ id: 14, name: 'v-window : ts' },
									],
								},
							],
						},
					],
				},
				{
					id: 15,
					name: 'Downloads :',
					children: [
						{ id: 16, name: 'October : pdf' },
						{ id: 17, name: 'November : pdf' },
						{ id: 18, name: 'Tutorial : html' },
					],
				},
				{
					id: 19,
					name: 'Videos :',
					children: [
						{
							id: 20,
							name: 'Tutorials :',
							children: [
								{ id: 21, name: 'Basic layouts : mp4' },
								{ id: 22, name: 'Advanced techniques : mp4' },
								{ id: 23, name: 'All about app : dir' },
							],
						},
						{ id: 24, name: 'Intro : mov' },
						{ id: 25, name: 'Conference introduction : avi' },
					],
				},
			],
			swipeDirection: 'None',
			menu138: [
				{ icon: 'home', title: 'Link A' },
				{ icon: 'info', title: 'Link B' },
				{ icon: 'warning', title: 'Link C' },
			],
			tab124: null,
			items124: ['web', 'shopping', 'videos', 'images', 'news'],
			text124:
				'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.',
			switch1: true,
			switch2: false,
			inset121: true,
			items121: [
				{
					action: 'mdi-label',
					title: 'List item 1',
				},
				{
					divider: true,
				},
				{
					action: 'mdi-label',
					title: 'List item 2',
				},
				{
					divider: true,
				},
				{
					action: 'mdi-label',
					title: 'List item 3',
				},
			],
			e119: 1,
			hidden118: false,
			value117: [423, 446, 675, 510, 590, 610, 760],
			snackbar115: false,
			text115: 'My timeout is set to 2000.',
			timeout115: 2000,
			media: 0,
			alarm: 0,
			zoom: 0,
			model108: null,
			theme107: {
				default: { isDark: false },
			},
			desserts106: [
				{
					name: 'Frozen Yogurt',
					calories: 159,
				},
				{
					name: 'Ice cream sandwich',
					calories: 237,
				},
				{
					name: 'Eclair',
					calories: 262,
				},
				{
					name: 'Cupcake',
					calories: 305,
				},
				{
					name: 'Gingerbread',
					calories: 356,
				},
				{
					name: 'Jelly bean',
					calories: 375,
				},
				{
					name: 'Lollipop',
					calories: 392,
				},
				{
					name: 'Honeycomb',
					calories: 408,
				},
				{
					name: 'Donut',
					calories: 452,
				},
				{
					name: 'KitKat',
					calories: 518,
				},
			],
			desserts105: [
				{
					name: 'Frozen Yogurt',
					calories: 159,
					fat: 6.0,
					glutenfree: true,
				},
				{
					name: 'Ice cream sandwich',
					calories: 237,
					fat: 9.0,
					glutenfree: false,
				},
				{
					name: 'Eclair',
					calories: 262,
					fat: 16.0,
					glutenfree: false,
				},
			],
			headers105: [
				{
					text: 'Dessert (100g serving)',
					align: 'start',
					sortable: false,
					value: 'name',
				},
				{ text: 'Calories', value: 'calories' },
				{ text: 'Fat (g)', value: 'fat' },
				{ text: 'Gluten-Free', value: 'glutenfree' },
			],
			elevations104: [6, 12, 18],
			items103: ['Foo', 'Bar', 'Fizz', 'Buzz'],
			scrollInvoked98: 0,
			x93: 0,
			y93: 0,
			rating92: 4.5,
			min91: -50,
			max91: 90,
			range91: [-20, 70],
			radioGroup: 1,
			ex7: 'red',
			ex8: 'primary',
			skill: 20,
			knowledge: 33,
			power: 78,
			interval87: {},
			value87: 0,
			page85: 1,
			absolute84: true,
			overlay84: false,
			dropdown_font83: ['Arial', 'Calibri', 'Courier', 'Verdana'],
			otp82: '',
			items81: [
				['mdi-email', 'Inbox'],
				['mdi-account-supervisor-circle', 'Supervisors'],
				['mdi-clock-start', 'Clock-in'],
			],
			people: [
				{ name: 'Sandra Adams', group: 'Group 1' },
				{ name: 'Ali Connors', group: 'Group 1' },
				{ name: 'Trevor Hansen', group: 'Group 1' },
				{ name: 'Tucker Smith', group: 'Group 1' },
			],
			items12: [
				{
					text: 'Dashboard',
					disabled: false,
					href: 'breadcrumbs_dashboard',
				},
				{
					text: 'Link 1',
					disabled: false,
					href: 'breadcrumbs_link_1',
				},
				{
					text: 'Link 2',
					disabled: true,
					href: 'breadcrumbs_link_2',
				},
			],
			// 15번 시작
			userInput: null,
			sheet: false,
			text: 'center',
			icon: 'justify',
			toggle_none: null,
			toggle_one: 0,
			toggle_exclusive: 2,
			toggle_multiple: [0, 1, 2],
			// 15번 끝

			// 17번시작
			type: 'month',
			types: ['month', 'week', 'day', '4day'],
			mode: 'stack',
			modes: ['stack', 'column'],
			weekday: [0, 1, 2, 3, 4, 5, 6],
			weekdays: [
				{ text: 'Sun - Sat', value: [0, 1, 2, 3, 4, 5, 6] },
				{ text: 'Mon - Sun', value: [1, 2, 3, 4, 5, 6, 0] },
				{ text: 'Mon - Fri', value: [1, 2, 3, 4, 5] },
				{ text: 'Mon, Wed, Fri', value: [1, 3, 5] },
			],
			value: '',
			events: [],
			colors: [
				'blue',
				'indigo',
				'deep-purple',
				'cyan',
				'green',
				'orange',
				'grey darken-1',
			],
			names: [
				'Meeting',
				'Holiday',
				'PTO',
				'Travel',
				'Event',
				'Birthday',
				'Conference',
				'Party',
			],
			//17번 끝
			//21번
			loading: false,
			selection: 1,
			show: false,
			//24번시작
			cards: [
				{
					title: 'Pre-fab homes',
					src: 'https://cdn.vuetifyjs.com/images/cards/house.jpg',
					flex: 12,
				},
				{
					title: 'Favorite road trips',
					src: 'https://cdn.vuetifyjs.com/images/cards/road.jpg',
					flex: 6,
				},
				{
					title: 'Best airlines',
					src: 'https://cdn.vuetifyjs.com/images/cards/plane.jpg',
					flex: 6,
				},
			],
			//25번시작
			items25: [
				{
					color: '#1F7087',
					src: 'https://cdn.vuetifyjs.com/images/cards/foster.jpg',
					title: 'Supermodel',
					artist: 'Foster the People',
				},
				{
					color: '#952175',
					src: 'https://cdn.vuetifyjs.com/images/cards/halcyon.png',
					title: 'Halcyon Days',
					artist: 'Ellie Goulding',
				},
			],
			// 26번시작
			model: 0,
			colors26: ['primary', 'secondary', 'yellow darken-2', 'red', 'orange'],
			//27번시작
			colors27: [
				'green',
				'secondary',
				'yellow darken-4',
				'red lighten-2',
				'orange darken-1',
			],
			cycle27: false,
			slides27: ['First', 'Second', 'Third', 'Fourth', 'Fifth'],
			items27: [
				{
					src: 'https://cdn.vuetifyjs.com/images/carousel/squirrel.jpg',
				},
				{
					src: 'https://cdn.vuetifyjs.com/images/carousel/sky.jpg',
				},
				{
					src: 'https://cdn.vuetifyjs.com/images/carousel/bird.jpg',
				},
				{
					src: 'https://cdn.vuetifyjs.com/images/carousel/planet.jpg',
				},
			],
			//30번
			selected: ['John'],
			checkbox: true,
			checkbox1: true,
			checkbox2: false,
			chip1: true,
			chip2: true,
			chip3: true,
			chip4: true,
			// 37번
			itemsPerPage: 4,
			items37: [
				{
					name: 'Frozen Yogurt',
					calories: 159,
					fat: 6.0,
					carbs: 24,
					protein: 4.0,
					sodium: 87,
					calcium: '14%',
					iron: '1%',
				},
				{
					name: 'Ice cream sandwich',
					calories: 237,
					fat: 9.0,
					carbs: 37,
					protein: 4.3,
					sodium: 129,
					calcium: '8%',
					iron: '1%',
				},
				{
					name: 'Eclair',
					calories: 262,
					fat: 16.0,
					carbs: 23,
					protein: 6.0,
					sodium: 337,
					calcium: '6%',
					iron: '7%',
				},
				{
					name: 'Cupcake',
					calories: 305,
					fat: 3.7,
					carbs: 67,
					protein: 4.3,
					sodium: 413,
					calcium: '3%',
					iron: '8%',
				},
			],
			headers38: [
				{
					text: 'Dessert (100g serving)',
					align: 'start',
					sortable: false,
					value: 'name',
				},
				{ text: 'Calories', value: 'calories' },
				{ text: 'Fat (g)', value: 'fat' },
				{ text: 'Carbs (g)', value: 'carbs' },
				{ text: 'Protein (g)', value: 'protein' },
				{ text: 'Iron (%)', value: 'iron' },
			],
			desserts38: [
				{
					name: 'Frozen Yogurt',
					calories: 159,
					fat: 6.0,
					carbs: 24,
					protein: 4.0,
					iron: '1%',
				},
				{
					name: 'Ice cream sandwich',
					calories: 237,
					fat: 9.0,
					carbs: 37,
					protein: 4.3,
					iron: '1%',
				},
				{
					name: 'Eclair',
					calories: 262,
					fat: 16.0,
					carbs: 23,
					protein: 6.0,
					iron: '7%',
				},
				{
					name: 'Cupcake',
					calories: 305,
					fat: 3.7,
					carbs: 67,
					protein: 4.3,
					iron: '8%',
				},
				{
					name: 'Gingerbread',
					calories: 356,
					fat: 16.0,
					carbs: 49,
					protein: 3.9,
					iron: '16%',
				},
				{
					name: 'Jelly bean',
					calories: 375,
					fat: 0.0,
					carbs: 94,
					protein: 0.0,
					iron: '0%',
				},
				{
					name: 'Lollipop',
					calories: 392,
					fat: 0.2,
					carbs: 98,
					protein: 0,
					iron: '2%',
				},
				{
					name: 'Honeycomb',
					calories: 408,
					fat: 3.2,
					carbs: 87,
					protein: 6.5,
					iron: '45%',
				},
				{
					name: 'Donut',
					calories: 452,
					fat: 25.0,
					carbs: 51,
					protein: 4.9,
					iron: '22%',
				},
				{
					name: 'KitKat',
					calories: 518,
					fat: 26.0,
					carbs: 65,
					protein: 7,
					iron: '6%',
				},
			],
			picker40: new Date(Date.now() - new Date().getTimezoneOffset() * 60000)
				.toISOString()
				.substr(0, 10),
			dialog41: false,
			dialog42: false,
			snack: false,
			snackColor: '',
			snackText: '',
			max25chars: v => v.length <= 25 || 'Input too long!',
			pagination: {},
			headers45: [
				{
					text: 'Dessert (100g serving)',
					align: 'start',
					sortable: false,
					value: 'name',
				},
				{ text: 'Calories', value: 'calories' },
				{ text: 'Fat (g)', value: 'fat' },
				{ text: 'Carbs (g)', value: 'carbs' },
				{ text: 'Protein (g)', value: 'protein' },
				{ text: 'Iron (%)', value: 'iron' },
			],
			desserts45: [
				{
					name: 'Frozen Yogurt',
					calories: 159,
					fat: 6.0,
					carbs: 24,
					protein: 4.0,
					iron: '1%',
				},
				{
					name: 'Ice cream sandwich',
					calories: 237,
					fat: 9.0,
					carbs: 37,
					protein: 4.3,
					iron: '1%',
				},
				{
					name: 'Eclair',
					calories: 262,
					fat: 16.0,
					carbs: 23,
					protein: 6.0,
					iron: '7%',
				},
				{
					name: 'Cupcake',
					calories: 305,
					fat: 3.7,
					carbs: 67,
					protein: 4.3,
					iron: '8%',
				},
				{
					name: 'Gingerbread',
					calories: 356,
					fat: 16.0,
					carbs: 49,
					protein: 3.9,
					iron: '16%',
				},
				{
					name: 'Jelly bean',
					calories: 375,
					fat: 0.0,
					carbs: 94,
					protein: 0.0,
					iron: '0%',
				},
				{
					name: 'Lollipop',
					calories: 392,
					fat: 0.2,
					carbs: 98,
					protein: 0,
					iron: '2%',
				},
				{
					name: 'Honeycomb',
					calories: 408,
					fat: 3.2,
					carbs: 87,
					protein: 6.5,
					iron: '45%',
				},
				{
					name: 'Donut',
					calories: 452,
					fat: 25.0,
					carbs: 51,
					protein: 4.9,
					iron: '22%',
				},
				{
					name: 'KitKat',
					calories: 518,
					fat: 26.0,
					carbs: 65,
					protein: 7,
					iron: '6%',
				},
			],
			icons56: ['mdi-facebook', 'mdi-twitter', 'mdi-linkedin', 'mdi-instagram'],
			expand: false,
			expand2: false,
			valid57: false,
			firstname57: '',
			lastname57: '',
			nameRules57: [
				v => !!v || 'Name is required',
				v => v.length <= 10 || 'Name must be less than 10 characters',
			],
			email57: '',
			emailRules57: [
				v => !!v || 'E-mail is required',
				v => /.+@.+/.test(v) || 'E-mail must be valid',
			],
			width60: 300,
			admins66: [
				['Management', 'mdi-account-multiple-outline'],
				['Settings', 'mdi-cog-outline'],
			],
			cruds66: [
				['Create', 'mdi-plus-outline'],
				['Read', 'mdi-file-outline'],
				['Update', 'mdi-update'],
				['Delete', 'mdi-delete'],
			],
			items69: ['Dog Photos', 'Cat Photos', '', 'Potatoes', 'Carrots'],
			model69: ['Carrots'],
			selected70: [2],
			items70: [
				{
					action: '15 min',
					headline: 'Brunch this weekend?',
					subtitle: `I'll be in your neighborhood doing errands this weekend. Do you want to hang out?`,
					title: 'Ali Connors',
				},
				{
					action: '2 hr',
					headline: 'Summer BBQ',
					subtitle: `Wish I could come, but I'm out of town this weekend.`,
					title: 'me, Scrott, Jennifer',
				},
				{
					action: '6 hr',
					headline: 'Oui oui',
					subtitle: 'Do you have Paris recommendations? Have you ever been?',
					title: 'Sandra Adams',
				},
				{
					action: '12 hr',
					headline: 'Birthday gift',
					subtitle:
						'Have any ideas about what we should get Heidi for her birthday?',
					title: 'Trevor Hansen',
				},
				{
					action: '18hr',
					headline: 'Recipe to try',
					subtitle:
						'We should eat this: Grate, Squash, Corn, and tomatillo Tacos.',
					title: 'Britta Holt',
				},
			],
			items71: [
				{
					icon: true,
					title: 'Jason Oner',
					avatar: 'https://cdn.vuetifyjs.com/images/lists/1.jpg',
				},
				{
					title: 'Travis Howard',
					avatar: 'https://cdn.vuetifyjs.com/images/lists/2.jpg',
				},
				{
					title: 'Ali Connors',
					avatar: 'https://cdn.vuetifyjs.com/images/lists/3.jpg',
				},
				{
					title: 'Cindy Baker',
					avatar: 'https://cdn.vuetifyjs.com/images/lists/4.jpg',
				},
			],
			fav78: true,
			menu78: false,
			message78: false,
			hints78: true,
			mutations80: 0,
			content80: 'Hello, world!',
		}
	},
	props: ['itemData'],
	watch: {
		userInput(val) {
			if (!val) {
				return
			}
			this.fetchEntriesDebounced()
		},
	},
	beforeDestroy() {
		clearInterval(this.interval87)
	},

	mounted() {
		this.interval87 = setInterval(() => {
			if (this.value87 === 100) {
				return (this.value87 = 0)
			}
			this.value87 += 10
		}, 1000)
		this.onResize93()
	},
	methods: {
		next() {
			this.onboarding144 =
				this.onboarding144 + 1 === this.length144 ? 0 : this.onboarding144 + 1
		},
		prev() {
			this.onboarding144 =
				this.onboarding144 - 1 < 0 ? this.length144 - 1 : this.onboarding144 - 1
		},

		swipe(direction) {
			this.swipeDirection = direction
		},
		menuItems() {
			return this.menu138
		},
		zoomOut() {
			this.zoom = this.zoom - 10 || 0
		},
		zoomIn() {
			this.zoom = this.zoom + 10 || 100
		},
		onScroll98() {
			this.scrollInvoked98++
		},
		onResize93() {
			this.windowSize = { x93: window.innerWidth, y93: window.innerHeight }
		},
		fetchEntriesDebounced() {
			// cancel pending call
			clearTimeout(this._timerId)

			// delay new call 500ms
			this._timerId = setTimeout(() => {
				// maybe : this.fetch_data()
				this.people = this.itemData ? this.itemData : []
			}, 500)
		},
		//17번시작
		getEvents({ start, end }) {
			const events = []

			const min = new Date(`${start.date}T00:00:00`)
			const max = new Date(`${end.date}T23:59:59`)
			const days = (max.getTime() - min.getTime()) / 86400000
			const eventCount = this.rnd(days, days + 20)

			for (let i = 0; i < eventCount; i++) {
				const allDay = this.rnd(0, 3) === 0
				const firstTimestamp = this.rnd(min.getTime(), max.getTime())
				const first = new Date(firstTimestamp - (firstTimestamp % 900000))
				const secondTimestamp = this.rnd(2, allDay ? 288 : 8) * 900000
				const second = new Date(first.getTime() + secondTimestamp)

				events.push({
					name: this.names[this.rnd(0, this.names.length - 1)],
					start: first,
					end: second,
					color: this.colors[this.rnd(0, this.colors.length - 1)],
					timed: !allDay,
				})
			}

			this.events = events
		},
		getEventColor(event) {
			return event.color
		},
		rnd(a, b) {
			return Math.floor((b - a + 1) * Math.random()) + a
		},
		//21번시작
		reserve() {
			this.loading = true

			setTimeout(() => (this.loading = false), 2000)
		},

		save45() {
			this.snack = true
			this.snackColor = 'success'
			this.snackText = 'Data saved'
		},
		cancel45() {
			this.snack = true
			this.snackColor = 'error'
			this.snackText = 'Canceled'
		},
		open45() {
			this.snack = true
			this.snackColor = 'info'
			this.snackText = 'Dialog opened'
		},
		close45() {
			console.log('Dialog closed')
		},
		onMutate() {
			this.mutations80++
		},
	},
	//17번끝
}
</script>

<style scoped>
a {
	text-decoration: none;
}

html {
	overflow-y: auto !important;
}

.v-progress-circular {
	margin: 1rem;
}

.v-card--reveal {
	align-items: center;
	bottom: 0;
	justify-content: center;
	opacity: 0.5;
	position: absolute;
	width: 100%;
}
</style>

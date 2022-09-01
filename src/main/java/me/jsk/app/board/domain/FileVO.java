package me.jsk.app.board.domain;

public class FileVO {
	
  private String fileNo;
  private String filePath;
  private String realFileNm;
  private String serverFileNm;
  private int linkDocNo;
  private int sortNo;
  private String writer;
  private String regDttm;
  private String useYn;
  
	public int getLinkDocNo() {
		return linkDocNo;
	}
	public void setLinkDocNo(int linkDocNo) {
		this.linkDocNo = linkDocNo;
	}
	public int getSortNo() {
		return sortNo;
	}
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getRealFileNm() {
		return realFileNm;
	}
	public void setRealFileNm(String realFileNm) {
		this.realFileNm = realFileNm;
	}
	public String getServerFileNm() {
		return serverFileNm;
	}
	public void setServerFileNm(String serverFileNm) {
		this.serverFileNm = serverFileNm;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDttm() {
		return regDttm;
	}
	public void setRegDttm(String regDttm) {
		this.regDttm = regDttm;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	  
}

package kr.co.treasurehunter.model;

public class Question {

	private String writer;
	private String title;
	private String contents;

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return String.format("Question [writer=%s, title=%s, contents=%s]", writer, title, contents);
	}
	
	

}

package com.se.pojo;

public class OnlineTest {
	private int id;
	private String knowledgeType;
	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;
	private int trueFreq;
	private int ansFreq;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKnowledgeType() {
		return knowledgeType;
	}

	public void setKnowledgeType(String knowledgeType) {
		this.knowledgeType = knowledgeType;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getChoiceA() {
		return choiceA;
	}

	public void setChoiceA(String choiceA) {
		this.choiceA = choiceA;
	}

	public String getChoiceB() {
		return choiceB;
	}

	public void setChoiceB(String choiceB) {
		this.choiceB = choiceB;
	}

	public String getChoiceC() {
		return choiceC;
	}

	public void setChoiceC(String choiceC) {
		this.choiceC = choiceC;
	}

	public String getChoiceD() {
		return choiceD;
	}

	public void setChoiceD(String choiceD) {
		this.choiceD = choiceD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getTrueFreq() {
		return trueFreq;
	}

	public void setTrueFreq(int trueFreq) {
		this.trueFreq = trueFreq;
	}

	public int getAnsFreq() {
		return ansFreq;
	}

	public void setAnsFreq(int ansFreq) {
		this.ansFreq = ansFreq;
	}

	@Override
	public String toString() {
		return "OnlineTest [id=" + id + ", knowledgeType=" + knowledgeType + ", question=" + question + ", choiceA="
				+ choiceA + ", choiceB=" + choiceB + ", choiceC=" + choiceC + ", choiceD=" + choiceD + ", answer="
				+ answer + ", trueFreq=" + trueFreq + ", ansFreq=" + ansFreq + "]";
	}

}

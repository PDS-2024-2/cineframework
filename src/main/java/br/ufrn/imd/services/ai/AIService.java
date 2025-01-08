package br.ufrn.imd.services.ai;

public class AIService {

	private AIProcessor aiProcessor;

	public AIService(AIProcessor aiProcessor) {
		this.aiProcessor = aiProcessor;
	}

	public String analysis(String prompt) {
		return this.aiProcessor.process(prompt);
	}
}

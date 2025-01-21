package br.ufrn.imd.cineframework.services.ai;

public class AIService {

	private AIProcessor aiProcessor;

	public AIService(AIProcessor aiProcessor) {
		this.aiProcessor = aiProcessor;
	}

	public String analysis(Object prompt) {
		return this.aiProcessor.process(prompt);
	}
}

package br.ufrn.imd.cineframework.services.ai;

public abstract class AIProcessor {

	protected AIModel aiProcessor;

	public AIProcessor(AIModel aiProcessor) {
		this.aiProcessor = aiProcessor;
	}

	public String process(Object prompt) {
		String promptProcessed = processPrompt(prompt);
		String bruteResponse = sendRequest(promptProcessed);
		return processResponse(bruteResponse);
	}

	protected abstract String processPrompt(Object prompt);

	protected abstract String sendRequest(String requestPrompt);

	protected abstract String processResponse(String prompt);
}

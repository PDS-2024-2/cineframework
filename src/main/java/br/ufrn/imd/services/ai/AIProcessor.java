package br.ufrn.imd.services.ai;

public abstract class AIProcessor {

	protected AIProcessor aiProcessor;

	public AIProcessor(AIProcessor aiProcessor) {
		this.aiProcessor = aiProcessor;
	}

	public String process(String prompt) {
		String promptProcessed = processPrompt(prompt);
		String bruteResponse = sendRequest(promptProcessed);
		return processResponse(bruteResponse);
	}

	protected abstract String processPrompt(String prompt);

	protected abstract String sendRequest(String requestPrompt);

	protected abstract String processResponse(String prompt);
}

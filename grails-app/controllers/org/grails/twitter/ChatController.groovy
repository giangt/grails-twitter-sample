package org.grails.twitter

class ChatController {
	def messageService

	def index(){
	}

	def addMessage(String message) {
		messageService.updateMessage(message)
		render "<script>getLatestMessages()</script>"
	}

	def getLatestMessages() {
		def messages = Message.listOrderByDateCreated(order: 'desc', max: 10)
		String content = g.render(template: "latestMessages", model: [messages: messages.reverse()])
		render content
	}
}

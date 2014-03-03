<g:each in="${messages}" var="message">
    <div>
        <span class="author">${message.author.realName}</span>: 
        <span class="statusMessage">${message.message}</span>
    </div>
</g:each>
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class dashdot extends ListenerAdapter {

	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw().toLowerCase();
		MessageChannel channel = event.getChannel();
		
		// "/." commands to act as lesser known test commands
		if (content.startsWith("/.weather map"))
		{
			channel.sendMessage("").queue();
		}
	}
}

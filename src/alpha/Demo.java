package alpha;
import org.apache.logging.log4j.*;
public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		log.error("button is not displayed");
		log.debug("I have to click the button");
		log.info("button is displayed");
		log.fatal("button is missing..");
	}
}

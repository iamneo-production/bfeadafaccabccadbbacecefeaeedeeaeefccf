@Controller
public class Myspring {
	@GetMapping("/")
	public String display()
	{
		return "Welcome String Boot!";
	}
}

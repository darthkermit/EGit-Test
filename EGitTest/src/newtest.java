
public class newtest {
	
	
	protected String word;
	public newtest(String word)
	{
		this.word = word;
	}
	
	public void doit()
	{
		System.out.println(this.word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}

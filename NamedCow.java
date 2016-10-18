class NamedCow extends Cow
{
	private String myName;
	public Cow(String name)
	{
		myName = name;
	}
	public Cow()
	{
		myName = "steve";
	}
	void String getName(){return myName;}
}
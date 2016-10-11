
void setup()
{
	//your variable declarations here
	size(400, 400);
	Cow c = new Cow("cow", "moo");
		System.out.println(c.getType() + "goes" + c.getSound());
	Chick h = new Chick("chicken", "cluck");
		System.out.println(h.getType() + "goes" + h.getSound());
	Pig p = new Pig("pig", "oink");
		System.out.println(p.getType() + "goes" + p.getSound());
}


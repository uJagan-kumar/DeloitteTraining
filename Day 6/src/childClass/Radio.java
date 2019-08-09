package childClass;

interface Radio 
{
		int freq=100;
		void play();
}

interface MusicPlayer 
{
		
		void songsList();
}

interface Artists extends MusicPlayer
{
	void fav();
}

class Childest implements Radio, Artists
{
	public void fav()
	{
		
	}
	
	public void songsList()
	{
		
	}
	
	public void play()
	{
		
	}
}
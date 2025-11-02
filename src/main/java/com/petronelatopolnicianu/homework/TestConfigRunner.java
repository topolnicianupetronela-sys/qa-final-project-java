public class TestConfigRunner {
	public static void main(String[] args) {
		//Instanță creată folosind fiecare dintre cei 3 constructori
		BrowserConfig browserConfig1 = new BrowserConfig(BrowserType.FIREFOX, "111", true);
        browserConfig1.afiseazaConfig();

        //Instanță creată folosind fiecare dintre cei 3 constructori
        BrowserConfig browserConfig2 = new BrowserConfig(BrowserType.EDGE, "118");
        browserConfig2.afiseazaConfig();

       //Instanță creată folosind fiecare dintre cei 3 constructori
        BrowserConfig browserConfig3 = new BrowserConfig(BrowserType.CHROME);
        browserConfig3.afiseazaConfig();

        //Instanță creată cu metoda statică Factory
        BrowserConfig browserConfig4 = BrowserConfig.createDefaultChromeConfig();
        browserConfig4.afiseazaConfig();
    }
}
public class BrowserConfig {
	private BrowserType browser;
	private String version;
	private boolean isHeadless;
	
    // Constructor 1: cu toate detaliile (browser, version, isHeadless)
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }
	// Constructor 2: doar cu detaliile (browser, version)
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false); 
    }
	// Constructor 3: doar cu browser (setând version la "latest" și isHeadless la false)
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false); 
    }
    // Metodă statica Factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metodă de afișare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}
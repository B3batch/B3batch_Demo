package librarydevelopment;

public class testScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		libraryclass myobj = new libraryclass();
		myobj.launchbrowser();
		myobj.idElementLocator();
		myobj.nameElementLocator();
		myobj.classNameElementLocator();
		myobj.newtab();
		myobj.linkTextElementLocator();
		myobj.partialLinkTextElementLocator();
		myobj.cssSelectorElementLocator();
		myobj.xpathElementLocator();
		myobj.closeBrowser();

	}

}

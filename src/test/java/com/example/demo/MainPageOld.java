package com.example.demo;

public class MainPageOld {
//    MainPage mainPage = new MainPage();
//
//    @BeforeClass
//    public static void setUpAll() {
//        Configuration.browserSize = "1280x800";
//        SelenideLogger.addListener("allure", new AllureSelenide());
//    }
//
//    @BeforeMethod
//    public void setUp() {
//        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
//        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
//        open("https://www.jetbrains.com/");
//    }
//
//    @Test
//    public void search() {
//        $x("//button[.='[A]ccept All']").click();
//        mainPage.searchButton.click();
//
//        $("[data-test='search-input']").sendKeys("Selenium");
//        $("button[data-test='full-search-button']").click();
//
//        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
//    }
//
//    @Test
//    public void toolsMenu() {
//        mainPage.toolsMenu.click();
//
//        $("div[data-test='main-submenu']").shouldBe(visible);
//    }
//
//    @Test
//    public void navigationToAllTools() {
//        mainPage.seeDeveloperToolsButton.click();
//        mainPage.findYourToolsButton.click();
//
//        $("#products-page").shouldBe(visible);
//
//        assertEquals(Selenide.title(), "All Developer Tools and Products by JetBrains");
//    }
}

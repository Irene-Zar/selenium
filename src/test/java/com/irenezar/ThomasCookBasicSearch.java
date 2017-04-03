package com.irenezar;

import com.irenezar.core.WebDriverTestBase;
import com.irenezar.pages.GoogleResultPage;
import com.irenezar.pages.GoogleSearchPage;
import com.irenezar.pages.ThomasCookHomePage;
import com.irenezar.pages.ThomasCookResultsPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by new_user on 4/3/2017.
 */
public class ThomasCookBasicSearch extends WebDriverTestBase {
        private String url = "https://www.thomascook.com/";
  //      private String fromLocation = "Any London";
  //     private String toLocation = "USA, Any";
  //      private String whenDate = "28 Jun 2017";
  //      private String durationNights = "10 Nights";



        @Test
        public void resultsPageDisplayed(){
            ThomasCookHomePage thomasCookHomePage = new ThomasCookHomePage(driver);
            thomasCookHomePage.openURL(url);
      //    thomasCookHomePage.sendSearchData(fromLocation,toLocation,whenDate,durationNights);
            thomasCookHomePage.submitClick();
            ThomasCookResultsPage thomasCookResultsPage = new ThomasCookResultsPage(driver);
            assertEquals(thomasCookResultsPage.TitleOnResultsPageDisplayed().getText(), true);
        }


    }


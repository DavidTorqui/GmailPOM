package com.sura.gmail.runnertags;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/gmail.feature",
				tags = "@tag1",
				glue = {"com.sura.gmail.definitions"}, 
				snippets = SnippetType.CAMELCASE)

public class GmailRunner {

}
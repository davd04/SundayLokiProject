$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonChangeLanguage.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Change Language Functionality",
  "description": "",
  "id": "amazon-change-language-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@us-245"
    }
  ]
});
formatter.before({
  "duration": 41898193500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 1278014600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Change Language",
  "description": "",
  "id": "amazon-change-language-functionality;change-language",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "mouse hover over language",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click Spanish",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "webpage should reload in Spanish",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 11800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.mouse_hover_over_language()"
});
formatter.result({
  "duration": 2762026800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.click_Spanish()"
});
formatter.result({
  "duration": 413180300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.webpage_should_reload_in_Spanish()"
});
formatter.result({
  "duration": 5125490200,
  "status": "passed"
});
formatter.after({
  "duration": 1466990700,
  "status": "passed"
});
formatter.uri("AmazonGiftCard.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Gift Card Functionality",
  "description": "",
  "id": "amazon-gift-card-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@us-246"
    }
  ]
});
formatter.before({
  "duration": 12651812600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 214100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Amazon Gift Card",
  "description": "",
  "id": "amazon-gift-card-functionality;amazon-gift-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click on Gift Cards",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on eGift Cards",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select Gift Card Design",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select Design",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select amount",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select delivery",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select to",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select from",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select message",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select quantity",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select delivery date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 11700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.click_on_Gift_Cards()"
});
formatter.result({
  "duration": 2389026100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearchResultSteps.click_on_eGift_Cards()"
});
formatter.result({
  "duration": 2885656700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_Gift_Card_Design()"
});
formatter.result({
  "duration": 112445300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_Design()"
});
formatter.result({
  "duration": 156315000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_amount()"
});
formatter.result({
  "duration": 366111900,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_delivery()"
});
formatter.result({
  "duration": 113008300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_to()"
});
formatter.result({
  "duration": 5045453900,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_from()"
});
formatter.result({
  "duration": 2271844300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_message()"
});
formatter.result({
  "duration": 2300154500,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_quantity()"
});
formatter.result({
  "duration": 2285952200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.select_delivery_date()"
});
formatter.result({
  "duration": 2257558400,
  "status": "passed"
});
formatter.match({
  "location": "AmazonCartPageSteps.add_to_cart()"
});
formatter.result({
  "duration": 2148224400,
  "status": "passed"
});
formatter.after({
  "duration": 1318100800,
  "status": "passed"
});
formatter.uri("AmazonPaymentError.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Payment Error Functionality",
  "description": "",
  "id": "amazon-payment-error-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@us-244"
    }
  ]
});
formatter.before({
  "duration": 7618018400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 160900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign In for payment error options",
  "description": "",
  "id": "amazon-payment-error-functionality;sign-in-for-payment-error-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open Amazon Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "click on Help",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Payment, charges or gift cards",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be asked to Sign In",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonHomePageSteps.open_Amazon_Homepage()"
});
formatter.result({
  "duration": 9000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.click_on_Help()"
});
formatter.result({
  "duration": 3059935700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearchResultSteps.click_on_Payment_charges_or_gift_cards()"
});
formatter.result({
  "duration": 2886189500,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHelpPageSteps.user_should_be_asked_to_Sign_In()"
});
formatter.result({
  "duration": 2082542500,
  "status": "passed"
});
formatter.after({
  "duration": 935793500,
  "status": "passed"
});
formatter.uri("PetApiTesting.feature");
formatter.feature({
  "line": 2,
  "name": "Pet Api Testing",
  "description": "",
  "id": "pet-api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 8241655200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create Pet ID",
  "description": "",
  "id": "pet-api-testing;create-pet-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create pet upload image",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Get pet",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Delete pet",
  "keyword": "Then "
});
formatter.match({
  "location": "PetstoreApiSteps.create_pet_upload_image()"
});
formatter.result({
  "duration": 8797560300,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.get_pet()"
});
formatter.result({
  "duration": 189532300,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.delete_pet()"
});
formatter.result({
  "duration": 200156900,
  "status": "passed"
});
formatter.after({
  "duration": 1422236800,
  "status": "passed"
});
formatter.uri("PetstoreApiTesting.feature");
formatter.feature({
  "line": 2,
  "name": "Petstore API Testing",
  "description": "",
  "id": "petstore-api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 9534002200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Pet CRUD API",
  "description": "",
  "id": "petstore-api-testing;pet-crud-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create pet",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Get pet",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Update pet",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Get pet",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Delete pet",
  "keyword": "Then "
});
formatter.match({
  "location": "PetstoreApiSteps.create_pet()"
});
formatter.result({
  "duration": 115674500,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.get_pet()"
});
formatter.result({
  "duration": 126565800,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.update_pet()"
});
formatter.result({
  "duration": 159225500,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.get_pet()"
});
formatter.result({
  "duration": 117768500,
  "status": "passed"
});
formatter.match({
  "location": "PetstoreApiSteps.delete_pet()"
});
formatter.result({
  "duration": 104023300,
  "status": "passed"
});
formatter.after({
  "duration": 781331000,
  "status": "passed"
});
});
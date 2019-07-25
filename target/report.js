$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Addcustomer.feature");
formatter.feature({
  "name": "To test add customer  functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test the generate customer Id functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "firstName",
        "vijay"
      ]
    },
    {
      "cells": [
        "lastName",
        "Saran"
      ]
    },
    {
      "cells": [
        "email",
        "er@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "Chennai"
      ]
    },
    {
      "cells": [
        "phoneNum",
        "956622333"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessPageSteps.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the generate customer Id functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill invalid customer details",
  "rows": [
    {
      "cells": [
        "firstName",
        "vijay"
      ]
    },
    {
      "cells": [
        "lastName",
        "Saran"
      ]
    },
    {
      "cells": [
        "email",
        "er@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "Chennai"
      ]
    },
    {
      "cells": [
        "phoneNum",
        ""
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_invalid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessPageSteps.the_user_should_see_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
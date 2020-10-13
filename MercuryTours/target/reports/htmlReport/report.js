$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddUserTest.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "As a person\r\nI want to generate a new account\r\nSo that I can login and make purchases",
  "id": "register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5896623800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Create an account",
  "description": "",
  "id": "register;create-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the right web address",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I can navigate to the \u0027Register\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill all fields using the following information",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Phone",
        "mail"
      ],
      "line": 10
    },
    {
      "cells": [
        "Elena",
        "Castilla",
        "07111111111",
        "hi@gmail.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "Address",
        "City",
        "State",
        "PostalCode"
      ],
      "line": 13
    },
    {
      "cells": [
        "18 Somewhere",
        "London",
        "London",
        "WX 0XX"
      ],
      "line": 14
    },
    {
      "cells": [
        "Username",
        "Password",
        "",
        ""
      ],
      "line": 16
    },
    {
      "cells": [
        "root",
        "root",
        "",
        ""
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I can login as a new user using",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 19
    },
    {
      "cells": [
        "root",
        "root"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.the_right_web_address()"
});
formatter.result({
  "duration": 1512235100,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_can_navigate_to_the_Register_page()"
});
formatter.result({
  "duration": 1063485300,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_fill_all_fields_using_the_following_information(DataTable)"
});
formatter.result({
  "duration": 1796143200,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_can_login_as_a_new_user_using(DataTable)"
});
formatter.result({
  "duration": 6413993900,
  "status": "passed"
});
formatter.after({
  "duration": 630118900,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/homepage.feature");
formatter.feature({
  "id": "validate-home-page-features",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    }
  ],
  "description": "",
  "name": "validate home page features",
  "keyword": "Feature",
  "line": 4
});
formatter.before({
  "duration": 494277,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-logo-on-the-navigation-bar-of-the-page",
  "tags": [
    {
      "name": "@verifyLogo",
      "line": 6
    }
  ],
  "description": "",
  "name": "Verify logo on the navigation bar of the page",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "verify the logo on navigation bar",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5163696051,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyLogo()"
});
formatter.result({
  "duration": 51006192,
  "status": "passed"
});
formatter.after({
  "duration": 1139998282,
  "status": "passed"
});
formatter.scenarioOutline({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items",
  "tags": [
    {
      "name": "@verifyDropdownList",
      "line": 11
    }
  ],
  "description": "",
  "name": "Verify dropdown menu is displayed on hovering navigation items",
  "keyword": "Scenario Outline",
  "line": 12,
  "type": "scenario_outline"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I hover on \u003citem\u003e",
  "keyword": "When ",
  "line": 14
});
formatter.step({
  "name": "I see below dropdown list",
  "keyword": "Then ",
  "line": 15,
  "rows": [
    {
      "cells": [
        "list item"
      ],
      "line": 16
    },
    {
      "cells": [
        "\u003clist_item_1\u003e"
      ],
      "line": 17
    },
    {
      "cells": [
        "\u003clist_item_2\u003e"
      ],
      "line": 18
    },
    {
      "cells": [
        "\u003clist_item_3\u003e"
      ],
      "line": 19
    },
    {
      "cells": [
        "\u003clist_item_4\u003e"
      ],
      "line": 20
    }
  ]
});
formatter.examples({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 22,
  "rows": [
    {
      "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;1",
      "cells": [
        "item",
        "list_item_1",
        "list_item_2",
        "list_item_3",
        "list_item_4"
      ],
      "line": 23
    },
    {
      "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;2",
      "cells": [
        "Games",
        "Arcade",
        "Sports",
        "RPG",
        "Adventure"
      ],
      "line": 24
    },
    {
      "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;3",
      "cells": [
        "Movies",
        "Action",
        "Comedy",
        "Thriller",
        "Sci-Fi"
      ],
      "line": 25
    },
    {
      "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;4",
      "cells": [
        "Mobiles",
        "Apple",
        "Motorola",
        "Blackberry",
        "Sony"
      ],
      "line": 26
    },
    {
      "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;5",
      "cells": [
        "Books",
        "Novels",
        "Literature",
        "Academics",
        "Biography"
      ],
      "line": 27
    }
  ]
});
formatter.before({
  "duration": 178264,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;2",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    },
    {
      "name": "@verifyDropdownList",
      "line": 11
    }
  ],
  "description": "",
  "name": "Verify dropdown menu is displayed on hovering navigation items",
  "keyword": "Scenario Outline",
  "line": 24,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I hover on Games",
  "keyword": "When ",
  "line": 14,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I see below dropdown list",
  "keyword": "Then ",
  "line": 15,
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "list item"
      ],
      "line": 16
    },
    {
      "cells": [
        "Arcade"
      ],
      "line": 17
    },
    {
      "cells": [
        "Sports"
      ],
      "line": 18
    },
    {
      "cells": [
        "RPG"
      ],
      "line": 19
    },
    {
      "cells": [
        "Adventure"
      ],
      "line": 20
    }
  ]
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5123249569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Games",
      "offset": 11
    }
  ],
  "location": "HomePageSteps.hoverOnNavBarMenu(String)"
});
formatter.result({
  "duration": 272306904,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyDropdownListItems(DataTable)"
});
formatter.result({
  "duration": 117298253,
  "status": "passed"
});
formatter.after({
  "duration": 988396635,
  "status": "passed"
});
formatter.before({
  "duration": 149094,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;3",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    },
    {
      "name": "@verifyDropdownList",
      "line": 11
    }
  ],
  "description": "",
  "name": "Verify dropdown menu is displayed on hovering navigation items",
  "keyword": "Scenario Outline",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I hover on Movies",
  "keyword": "When ",
  "line": 14,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I see below dropdown list",
  "keyword": "Then ",
  "line": 15,
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "list item"
      ],
      "line": 16
    },
    {
      "cells": [
        "Action"
      ],
      "line": 17
    },
    {
      "cells": [
        "Comedy"
      ],
      "line": 18
    },
    {
      "cells": [
        "Thriller"
      ],
      "line": 19
    },
    {
      "cells": [
        "Sci-Fi"
      ],
      "line": 20
    }
  ]
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5150763807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Movies",
      "offset": 11
    }
  ],
  "location": "HomePageSteps.hoverOnNavBarMenu(String)"
});
formatter.result({
  "duration": 218235111,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyDropdownListItems(DataTable)"
});
formatter.result({
  "duration": 98133252,
  "status": "passed"
});
formatter.after({
  "duration": 1054274366,
  "status": "passed"
});
formatter.before({
  "duration": 155576,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;4",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    },
    {
      "name": "@verifyDropdownList",
      "line": 11
    }
  ],
  "description": "",
  "name": "Verify dropdown menu is displayed on hovering navigation items",
  "keyword": "Scenario Outline",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I hover on Mobiles",
  "keyword": "When ",
  "line": 14,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I see below dropdown list",
  "keyword": "Then ",
  "line": 15,
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "list item"
      ],
      "line": 16
    },
    {
      "cells": [
        "Apple"
      ],
      "line": 17
    },
    {
      "cells": [
        "Motorola"
      ],
      "line": 18
    },
    {
      "cells": [
        "Blackberry"
      ],
      "line": 19
    },
    {
      "cells": [
        "Sony"
      ],
      "line": 20
    }
  ]
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5090518138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobiles",
      "offset": 11
    }
  ],
  "location": "HomePageSteps.hoverOnNavBarMenu(String)"
});
formatter.result({
  "duration": 273589864,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyDropdownListItems(DataTable)"
});
formatter.result({
  "duration": 105227619,
  "status": "passed"
});
formatter.after({
  "duration": 1114735572,
  "status": "passed"
});
formatter.before({
  "duration": 151254,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-dropdown-menu-is-displayed-on-hovering-navigation-items;;5",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    },
    {
      "name": "@verifyDropdownList",
      "line": 11
    }
  ],
  "description": "",
  "name": "Verify dropdown menu is displayed on hovering navigation items",
  "keyword": "Scenario Outline",
  "line": 27,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I hover on Books",
  "keyword": "When ",
  "line": 14,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I see below dropdown list",
  "keyword": "Then ",
  "line": 15,
  "matchedColumns": [
    1,
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "list item"
      ],
      "line": 16
    },
    {
      "cells": [
        "Novels"
      ],
      "line": 17
    },
    {
      "cells": [
        "Literature"
      ],
      "line": 18
    },
    {
      "cells": [
        "Academics"
      ],
      "line": 19
    },
    {
      "cells": [
        "Biography"
      ],
      "line": 20
    }
  ]
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5205469788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 11
    }
  ],
  "location": "HomePageSteps.hoverOnNavBarMenu(String)"
});
formatter.result({
  "duration": 234145984,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyDropdownListItems(DataTable)"
});
formatter.result({
  "duration": 103822574,
  "status": "passed"
});
formatter.after({
  "duration": 1101508383,
  "status": "passed"
});
formatter.before({
  "duration": 155036,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-home-page-features;verify-the-products-are-displayed",
  "tags": [
    {
      "name": "@verifyProducts",
      "line": 30
    }
  ],
  "description": "",
  "name": "verify the products are displayed",
  "keyword": "Scenario",
  "line": 31,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage",
  "keyword": "Given ",
  "line": 32
});
formatter.step({
  "name": "verify list of products is displayed",
  "keyword": "Then ",
  "line": 33
});
formatter.step({
  "name": "verify image is displayed for each product",
  "keyword": "And ",
  "line": 34
});
formatter.step({
  "name": "verify title is displayed for each product",
  "keyword": "And ",
  "line": 35
});
formatter.step({
  "name": "verify manufacturer is displayed for each product",
  "keyword": "And ",
  "line": 36
});
formatter.step({
  "name": "verify description is displayed for each product",
  "keyword": "And ",
  "line": 37
});
formatter.step({
  "name": "verify price is displayed for each product",
  "keyword": "And ",
  "line": 38
});
formatter.step({
  "name": "verify add to cart button is displayed for each product",
  "keyword": "And ",
  "line": 39
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5096499705,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyProductListDisplayed()"
});
formatter.result({
  "duration": 61583730,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyProductImageIsDisplayed()"
});
formatter.result({
  "duration": 1212715950,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyTitleIsDisplayed()"
});
formatter.result({
  "duration": 1566300433,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyManufacturerIsDisplayed()"
});
formatter.result({
  "duration": 1169055854,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyDescriptionIsDisplayed()"
});
formatter.result({
  "duration": 1108594107,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyPriceIsDisplayed()"
});
formatter.result({
  "duration": 1474940133,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyAddToCartButtonIsDisplayed()"
});
formatter.result({
  "duration": 1042233983,
  "status": "passed"
});
formatter.after({
  "duration": 917539395,
  "status": "passed"
});
});
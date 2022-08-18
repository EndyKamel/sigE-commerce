@smoke
  Feature: user search fo something
    Scenario Outline: user could search using product name
      Given user write "<productName>"
      And press on search button
      When user could search using "<productName>" and Count number of search
      Examples:
      |productName|
      |book       |
      |laptop     |
      |nike       |

    Scenario Outline: user could search for product using sku
      Given user write "<productSku>"
      And press on search button
      When user could search using "<productSku>" and Count number of search
      Examples:
      |productSku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
# trips-documenter

The aim of this project it to practice and gain skills by
    - applying TDD  and DDD concepts.
    - applying SOLID principles.
    - Practicing with Spring framework
The idea of the project is to provide an API for a web/mobile Trip Documenter App. Through the App, the user will be able to document and plan his trips.

## Designs:
[Class Diagram](https://drive.google.com/file/d/1b9Wz9O7F0BkkaoVXtv-_s2c5NMvRB75a/view?usp=sharing)

## Technical Debt
    - Seperate Unit and Integration tests.

## User Stories
### User Story No. 1
As a user I want to add the cost of each item I had to pay for so that I can track the cost of the whole trip later. 
#### Acceptance Criteria:
* The cost should be entered along side with the orignal currency.
* When the user view the cost of the trip ot the item, the cost should be appear with the original currency and the user currency.
### User Story No. 2
As a user I want to plan for a trip ahead.
#### Acceptance Criteria:
* The user should be able to add aplan and actions. The actions should be in new, started, completed, suspended, or abandoned status.
* The actions could depend on each other and be sequenced. i.e. an action should not be started unless all dependent actions completed.
* An action could have multiple consequences actions. 

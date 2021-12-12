# Spring ORM
- used to integrate data access code with spring (ORM)
- combines hibernate + spring + JPA

#### Benefits Include:
- easier testing
- less boilerplate code
- easy transaction management 
- no more hibernate configuration

## Required Spring Beans involved in Spring ORM
1. Data Source
2. SessionFactory
3. Transaction Factory

- Data source is injected in our SessionFactory. 
- SessionFactory is then injected in TransactionManager.
- SessionFactory is also injected into each of our DAOs.
    - the only part of this we interact with

## Contextual Sessions
- session which executes within the application context
- session is managed by spring (unless you configure JTA - Java Transaction API)

## Transactions
`@Transactional` indicates that a persistence method takes place in a transactional context (i.e. on DAO methods)

<br>

### Transaction Propagation <hr>
<br>
#### REQUIRED
`@Transactional(propagation=Propagation.REQUIRED)`
- same physical transaction will be used if one already exists, otherwise a new transaction will be opened

#### REQUIRES_NEW
`@Transactional(propagation=Propagation.REQUIRES_NEW)`
- indicates a new physical transaction will be created for @Transactional method -- inner transaction can commit or rollback independently of the outer transaction

#### NESTED
`@Transactional(propagation=Propagation.NESTED)`
- inner and outer use same physical transaction, but are separated by savepoints (JDBC drivers only)

#### MANDATORY
`@Transactional(propagation=Propagation.MANDATORY)`
- existing transaction must already be opened or container will throw an error

#### NEVER
`@Transactional(propagation=Propagation.NEVER)`
- container will throw an error if a session is open (oppostite of mandatory)

#### NOT_SUPPORTED
`@Transactional(propagation=Propagation.NOT_SUPPORTED)`
- executes outside any existing transaction, current existing transaction will be paused

#### SUPPORTS
`@Transactional(propagation=Propagation.SUPPORTS)`
- executes within the scope of existing transaction
- otherwise, executes non-transactionally 

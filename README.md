# HMRC Shopping Cart Exercise 

## Template
Project was created from an sbt g8 template

`sbt new scala/scala-seed.g8`


## Assumptions
- all prices are in pence
- prices not formatted as money, if this was a hard requirement would use a 3rd party library like Joda money. 

## Notes 
- started off with simple string matching for items
- converted to case object types to simplify calculations when supporting multiple items

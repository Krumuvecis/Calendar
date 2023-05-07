# Referencable units

## Abstract

Don't create a new instance of a measurement unit every time you need to read something common e.g. name of the unit;
read it from a reference table!


## Structure

Contains **two reference tables**:
* **Enum-class** reference table
  * _See section **Reference enums** below._
  * Throws `UndefinedEnumReferenceException`, if no key with such enum found.
* **Class-instance** reference table
  * _TODO: finish this description_
  * Throws `UndefinedClassReferenceException`, if no key with such class found.


## Reference enums

Each ReferencableUnit has a reference enum, for easier unit reference.
Refer to e.g. `SECOND`, instead of `Second.class`.


_more info coming soon..._
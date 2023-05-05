# Milestone 3 - INFO201
### Zac Seales - 6687905

## Program Summary

This 'etail' project is in the very early stages of development.
Executing the etail program will display a main menu window which allows a user to either: Add a new product, or browse a store of existing products (As well as giving the option to edit or remove existing products.)

The product editor will handle any invalid input or exceptions before saving a new product to the data store.

The product viewer allows the user to either: filter products by category using a dropdown box, or search for a specific product by typing in a productID.
The viewer also allows a selected product to be removed, or edited.

## Use Case Diagrams
These diagrams highlight the chain of interactions required to perform specific usecases.

#### Add a new Product
https://isgb.otago.ac.nz/info201/seaza886/etail/blob/master/sequenceDiagrams/AddProduct.puml

#### View current Products
https://isgb.otago.ac.nz/info201/seaza886/etail/blob/master/sequenceDiagrams/ViewProducts.puml

#### Search for a specific Product
https://isgb.otago.ac.nz/info201/seaza886/etail/blob/master/sequenceDiagrams/SearchByID.puml

#### Delete an Existing Product
https://isgb.otago.ac.nz/info201/seaza886/etail/blob/master/sequenceDiagrams/DeleteProduct.puml


## Clarifications

I found that searching a productID after the product has been removed would still return the product.
This is because the searchByID function uses the HashMap whereas the removeProducts uses a seperate HashSet.
I have made it so that the product is also removed from the hash map to avoid possible confusion regarding current products.
I've left categories as permanent, this does not affect the category filtering.

#### Requirements

Unique fields are not unique. Currently relies on user memory as there are no checks to ensure exclusivity.
Ideally this should be automatically generated for ID fields.

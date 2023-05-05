# Milestone 2 - INFO201

## Summary Report

The plan has not changed (from milestone1) but this interview seems to be focused more on designing the 'base system' correctly.
The base system largely involves; Product browsing, online sales, and customer registration.
This report will focus on these concepts in more detail, highlighting the stakeholder interactions and the underlying processes.

Supposedly the system will not have a complicated search function because other third party softwares already provide search engines and data entry is too time consuming.
I believe this may affect the number of site users as there are other online stores that offer the same services but also provide efficient searching and browsing. A personal search engine could increase repeat customers.
I'm also unsure why data entry is out of the question. Isn't that my job?
Having an appropriate database will allow for a far more efficient system which again, will vastly improve customer satisfaction.

As far as I know there's no difference between sales of music and sales of accessories so I'll be grouping them all as 'products' to simplify planning.

Stock is either shipped from a store or straight from the stock suppliers.
I'm unsure if suppliers are willing to gift-wrap items so it's possible that gift-wrapping will only be available for certain items.
I'll have to clarify this at the next interview but for now I am going to assume that suppliers will gift wrap and send orders.

## Business Rules

Customers that are not registered (or not logged in) can not make purchases.
They will only have the ability to browse the site.

Registered Customers can log in to their personal account using their email and a password that they have created.

'Logged-in' customers will have the ability to make online transactions.

Customers that are logged in will be able to modify a personal shopping cart as they browse the website products.
This includes; adding items, removing items, changing quantity of items.

Logged in customers will be able to checkout their cart and customize delivery options for each item (or a group items).
Delivery Options include; delivery address, optional gift-wrapping.

Staff have the ability to update weekly recommendations, including new products, current sales, and personal recommendations (Music or accessories).

The system must allow for secure customer registration and account storage.

The system must be able to correctly calculate GST dependent on the delivery address (NZ or AUS) and the total transaction price.

## Use Case Diagrams

#### General Overview
As you can see, my system overview diagram is complicated, untidy and difficult to understand. I've left it here because it helps me understand the system requirements but I've seperated this into smaller domains to try and simplify communication with stakeholders.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/GeneralOverview.puml

#### Unregistered Customer Interactions
Anyone who accesses the website will have the ability to browse, modify their cart, or register a new account.
The contents of the cart can not be purchased until an account has been created.
No other stakeholders are necessary for this interaction.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/unregistered.puml

#### Customer Purchase
Customers with an account will have the same capabilities as unregistered customers but will also have the added privilege of making a purchase (ie. checking out the contents of their shopping cart)
This use-case diagram highlights a purchase interaction.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/customerPurchase.puml

#### Staff interactions
Staff will be the most frequent users of the system. Hopefully this diagram will give them an idea of how they will use the system.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/StaffInteractions.puml

## Entity-Relationship Diagram

This ERD represents the entities involved for the HV LoFi online system.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/ImplementERD.puml

## Lo-Fi UI Mock-Ups

Registration of a new customer.
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/Registration.puml

View shopping cart (prior to checkout).
https://isgb.otago.ac.nz/info201/seaza886/assignments/blob/master/milestone2/ViewCart.puml
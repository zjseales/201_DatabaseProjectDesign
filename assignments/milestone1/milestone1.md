# INFO 201 Milestone 1
Zac Seales 6687905

## System Summary

An online music store, HV Lo-Fi, that provides a stylish, easy-to-use interface which allows customers to search, browse, select, and purchase products.

This store will have a main-page that contains recommendations/sales/ads, an account registration/login option, and also the online store which anyone can
search. 
Customers will have the option to register an account, providing personal recommendations and making future transactions simpler.
Customers will be able to easily search and find what they're after.
Products will be sorted by; Artist, Genre, Title, Album, Year, Price, or a combination of these dependent on the customers selection.
For each of these variables, there will be; a list of available options, and also a textbox search bar for manual keyboard input.
Once a customer has made their selection they will be given all options that suit their requirements, in an easy-to-browse interface.

Each available product will be able to be added to a customers personal cart, once they are finished shopping they will be able to checkout and complete
their transaction. All fees will be calculated and customers will receive an invoice once payment is made.
A large variety of payment methods will be made available by third party softwares.

Staff will be able to update stock, update main-page advertisements, as well as manage deliveries and orders.

## Functional Requirements

#### Search Products - MUST HAVE
Customers will need to search available products easily.
If searching for a product feels like a chore then a customer will not bother.
The Graphics used should be thematic (old-school music) and appealing.
Customers will also need to know what products are available for purchase.
Staff may also need to use this function when updating current stock.

#### Select Products (Add To Cart) - MUST HAVE
Customers need the ability to easily select the products they wish to buy.
The obvious implementation is each online user will have a personal cart which contains any items/products they wish to add.
This cart should also contain a very simple "pre-receipt" containing all items and total cost.

#### Checkout (Purchase all items in cart) - MUST HAVE
Process customer payment, using secure third party software.
There are many options but after doing a small amount of research, Windcave software looks ideal.
The checkout function will also provide delivery options, which will be sent to staff for delivery management, and a printable invoice (or email).

#### Create Invoice - MUST HAVE
Essential to a retail business, System must create an invoice for each transaction
Customers will need an invoice receipt as proof of purchase.
Staff will need access to current transactions to fulfill orders.

#### Add Products - MUST HAVE
Staff will need the ability to update new and available stock.
New stock will need to be assigned all the appropriate variables. (Artist, year, album, trackTitle, price).

#### Update products - MUST HAVE
Management staff will need the ability to update prices as they change (Inflation/Deflation).
Also possible that a product has been added with the wrong information so management will need certain access privileges that allow them to change this.

#### Update Main Page - MUST HAVE
Not essential for the system but I still consider advertisement a high priority.
Staff should have the ability to provide personal recommendations, and also change the advertisements on the main site page.
Main page will advertise new products, current sales, and custom recommendations.
Should also have franchise info, as well as links to local-store info. Locations, Opening hours, contact numbers.

#### Register Account - SHOULD HAVE
Customers should be able to fill out a form and be assigned a personal account.
This can offer custom recommendations based on; previous purchases, music preferences, birth year.
Will also provide a loyalty scheme which the system will need to manage. Need to follow up on specific details.
Customers should have the option to receive emails, advertising latest stock and sales.
Should also be able to securely record payment info to make future transactions simpler. (ie. shouldn't have to fill out payment info each time)
Windcave might offer this security, will have to check.

#### Log-in - SHOULD HAVE (If Register account then MUST HAVE)
If a customer registers an account they will need to log-in and be authenticated by the system's security.
Will just involve a username or email, and a password. PASSWORD MUST BE ENCRYPTED AND NEVER STORED.

#### Transfer Item - SHOULD HAVE
Staff currently transfer items between stores, this should still be available for online user's who wish to pick-up items from their local store.
Perhaps if a customer decides to pick-up then they should be asked which store they want to pick-up from and the item will be sent there.
Customers will need to be updated regularly on the delivery (Tracking, arrival estimation).

#### Sell Products - COULD HAVE
Might want to give customers the ability to sell second hand products online, since that is a large part of the store's business.
Only problem is regulating the quality of these items. As second-hand items are currently purchased in-store, it's much easier to check the 
quality of these products in-person. I'm not sure how you would manage that online.

## Non-Functional Requirements

#### GUI - Usability
Customers, and staff, will need an easy to use interface.
Interface must be visually appealing and have an old-school music theme.
Site will have one main page which contains links to all other contents. (Store for browsing/searching products, personal cart, store/franchise info).
Each product will need a picture (usually album cover).

#### Customer Registration Form
Will need to provide customers with a form to fill out when they wish to register an account.

#### Invoice report
Invoice will need to calculate and display all costs. Including GST and possible additional fees (delivery costs, item rarity).

#### Product Management - Reliability
Products must be kept up to date with current price, available stock.

#### Online - Supportability
System must be a website, and should keep in mind possible smartphone implementation for the future.

#### Sorting/Searching - Performance
Database Structure and sorting algorithms will need to be chosen carefully to optimise computation times.

#### Staff Privileges
Staff will need access to certain functions (add products, update ads and main page)

## Glossary

**Interface** : The elements that a user (customer or staff) interacts with.


**GUI** : (Graphical User Interface) The on-screen interface graphics, includes buttons, images, layout.


**Database Structure** : The storage method used to hold all products. If chosen well, can simplify sorting and searching, 
drastically optimizing wait times.


**Sorting algorithms** : Many different methods to sort and search items. Again, must be chosen well, depending on the specific function.


## Follow-Up
Lecture Harriet on the fact that she records her customers passwords on paper.

Questions:

"Do you plan on delivering overseas?"
If so, will need to compute international delivery costs.

"Did you plan on offering the sell service, that you provide in store, online?" 
If so, "Did you have any ideas on how that might work?"
(Address concerns regarding online second-hand product quality)

Bring up the points from this link; 
https://www.polipay.co.nz/blog/top-12-methods-for-accepting-online-payments-in-new-zealand/
and suggest windcave and why.
It provides a huge variety of payment methods which will make it very easy for customers to choose their preferred method.
Having one external payment stakeholder will drastically simplify internal management.

Address concerns of third party registrations;
A custom registration form is much easier to implement, Google and Apple require an Authentication Server. I'll look into what that entails.

Ask for a list of all products and check how they currently manage items and products.
How is current stock stored and sorted? Have you ever had issues with this, could it be improved?

Follow up on loyalty scheme for registered customers.
"Can I get more info on the loyalty rewards?"
"What does the loyalty scheme give?"
"Should the online system calculate discounts automatically?"
"Would you like users to be able to access their available rewards/progress?"

Ask for a list of all current store locations, opening hours, and contact details. 

"Besides customers and staff, will anyone else be using this system?"

"So current stock is scattered amongst stores, right? When an item is purchased will the nearest store with that product available need to be notified?"
# Assesstment Description
Visit abc.com for demo hosting site with assesstment. Credential : email =admin@yourstore.com, password =admin987

**1) Custom Discount Plugin**

Installation Steps for Plugin:
For this task we have created a discountRequirement plugin.
- Go to Local Plugin in Admin Area
- Look for Custom Discount Plugin, install and restart (it will add a discount assigned to total with discount requirement rule by default)
- ![image](https://github.com/user-attachments/assets/91e8045a-00b6-466f-96d2-b04fadd31678)
- Now you can configure from admin menu or configure link of that plugin
- Enable Plugin and enter desired discount percentage
- Now discount will be applied to checkout if a customer have more orders that defined in discount requirement rule
- ![image](https://github.com/user-attachments/assets/b740b71f-cd4a-437c-aaef-d3d5ea835315)
- No. of Order refers to Total no. of orders require to apply this discount

**2) Adding Gift Message**

For adding Gift Message at checkout, add a new checkout attributes name 'Gift Message' with control type textbox. It will be shown on both public store checkout cart  page and in order's product detail in admin site.
![image](https://github.com/user-attachments/assets/9e1368e3-663e-42d2-babf-7b498f4ade02)
![image](https://github.com/user-attachments/assets/64c69517-5fcd-47b2-aafc-eb2033b4e9df)

**3) Search Attribute by Name/Keyword Search in Product Attribute**

I have add ExtendedViewExpander for extending views, I have done everything inside my Custom folder Extended. We can find that extended folder in nop.web, nop.core, nop.data, nop.services and nop.framework. I have used extended directory so why i don't need to touch core code, i will extend partial class and override methods if needed, I think this is better approach to keep our core code untouch from custom codes and customizations. This will make us ease to upgrade our nopcommerce version in future. ------search ko image -------

**4) API Development (Order Retrieval)**

Added a API module in our application with JWT authentication. I have enable swagger to.
-For testing API endpoints, Go to ------my api path---
-Generate Token by Generate Token Method (use username:admin@yourstore.com, password:admin987), you will provided a token ---use image here---
-use that token to authorize, then after authorize try GetOrderDetailsByEmail method(email=admin@yourstore.com), if user is authorize and exist then it will return orders in json format.
--use image here--

**Postman collection is provided in wwwroot named as -----name here-------**

**Azure hosting (App Service)**

I have brief knowledge about Azure hosting through App Services
- Go to [portal.azure.](https://portal.azure.com/#home)
- Click on App Service and create a new app
![image](https://github.com/user-attachments/assets/f9ed39f6-1dea-49a8-9952-389add2cb4a2)
- Fill the required fields like Subscription, Region, Engine, Servername, Database name, hosting plans and create..
![image](https://github.com/user-attachments/assets/0c40ecc4-cc30-40a8-b385-d8e675c6a4ea)
-Now we can publish our webapp to azure through visual studio Directly
![image](https://github.com/user-attachments/assets/d108a448-102e-42bb-bfb3-5c74c0cc69bf)
![image](https://github.com/user-attachments/assets/8c6365ed-c442-4482-8104-4c91096899d9)

**Azure hosting CI/CD**

This is deployment mechanism i am currenly working with.
this consist of pipelines or better say build pipelines which will generate those artifacts and releases which actually takes those artifacts and deploy to necessary enviroments.
![image](https://github.com/user-attachments/assets/d7bafac8-1295-410b-b3d4-08eb9aee0ebd)
![fff](https://github.com/user-attachments/assets/043219b8-8cb9-4406-99f6-33780d7ab540)





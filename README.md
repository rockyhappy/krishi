# Krishi Kalyaan

## Overview
Krishi Kalyaan is a bilingual Android application developed to facilitate lending and borrowing of farming items among farmers. Built with a modern MVVM architecture and incorporating Firebase services, it offers a seamless experience for farmers to connect, share resources, and improve agricultural practices.

## Features

### User-Friendly Authentication
Krishi Kalyaan offers a seamless authentication experience for farmers through phone number authentication. Users can easily log in or sign up using their phone numbers, eliminating the need to remember complex passwords. The app provides OTP (One-Time Password) services for quick and secure authentication, ensuring a hassle-free login process.

### Intuitive UI
The app is designed with an intuitive and user-friendly interface to cater to farmers of all backgrounds and tech-savviness. The UI is crafted to be easily understandable and navigable, allowing users to access essential features and functionalities with minimal effort. Clear instructions and visual cues guide users through the app, enhancing their overall experience.

### Real-time Data Synchronization
Krishi Kalyaan utilizes Firebase Firestore for real-time data storage and synchronization. This enables farmers to access the latest information instantly, ensuring that they always have up-to-date data at their fingertips. Whether listing farming items, managing requests, or updating profile information, changes are synchronized across devices in real time, enhancing collaboration and communication among users.

### Image Management
The app allows users to upload and manage images of farming items using Firebase Storage. Farmers can easily add images to their product listings, providing visual representations of the items they want to lend or borrow. This not only enhances the user experience but also makes product listing more appealing and informative, helping users make informed decisions.

### Security Integration
Krishi Kalyaan integrates Play Integrity App Check to ensure app security and authenticity. This helps protect users from potential security threats and ensures that the app is trustworthy and safe to use. By leveraging Play Integrity, the app maintains a high level of security, providing users with peace of mind while using the platform.

### Dependency Injection
The app utilizes Dagger Hilt for streamlined dependency management, ensuring robustness, scalability, and maintainability of the codebase. Dagger Hilt simplifies the process of managing dependencies and promotes code reusability, making it easier for developers to add new features or make changes to existing ones.

### Efficient Image Loading
Krishi Kalyaan employs Coil for efficient image loading and caching. Coil is a lightweight image loading library that optimizes image loading performance and memory usage. By efficiently loading and caching images, the app delivers a smooth and responsive user experience, even when dealing with large amounts of image data.

### Local Data Storage
The app uses Datastore for local data storage, enabling offline access to essential information. Datastore provides a reliable and efficient way to store and retrieve data locally on the device, ensuring that users can access critical data even when they are offline or have limited connectivity. This enhances the app's usability and reliability, especially in rural areas with unreliable internet access.

### RazorPay Payment Wall
The application comes along with a well integrated payment wall to allow the user for a proper flow of simplification. The user is highly authenticated and the safety of payment is ensured. 

## Usage
The app provides farmers with the following functionalities:
1. **Login/Signup**: Farmers can log in or sign up using their phone numbers. OTP services provide easy authentication.
2. **Choose Role**: Users can choose to be either lenders or borrowers.
3. **Product Listing**: Farmers can list farming items they want to lend or borrow from a predefined list or by adding new products.
4. **Request Management**: Lenders and borrowers can manage their lending and borrowing requests, including accepting or rejecting requests.
5. **Online Payment**: The application comes along with the payment wall for the ease of the user


## Dependencies
Krishi Kalyaan relies on the following key dependencies:
- **Firebase Auth**: For user authentication via phone number. 
- **Firebase Firestore**: For real-time data storage and synchronization.
- **Firebase Storage**: For managing images of farming items.
- **Play Integrity App Check**: For ensuring app integrity and security.
- **Dagger Hilt**: For streamlined dependency management.
- **Kotlin Symbolic Programming (KSP)**: For efficient code generation.
- **Coil**: For efficient image loading and caching.
- **Datastore**: For local data storage.
- **RazorPay**: For the integration of online payment 


## Screenshots

### Authentication Screens 
<div style="display: inline-block; margin-right: 20px; display: flex; justify-content: space-around;">
<img src="https://github.com/rockyhappy/krishi/assets/115190222/671822cd-e103-49d3-8057-d65400fc80bc" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/fce1811b-0ef5-4b39-90b8-a265e6dca6c9" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/26c3bc34-59a3-4b8e-94a5-6c298d734b52" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->  
<img src="https://github.com/rockyhappy/krishi/assets/115190222/8836cd7c-f20f-4b48-a3c6-6ab961b00dab" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
</div>

### Lender's Dashboard

<div style="display: inline-block; margin-right: 20px; display: flex; justify-content: space-around;">
<img src="https://github.com/rockyhappy/krishi/assets/115190222/94128517-dd08-4d2d-996b-e4473f14a15c" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/8dbf59a5-36e3-4932-82a9-20a884bef73e" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/9f6e04b9-c5b1-4759-9231-d95110ad2d22" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->  
<img src="https://github.com/rockyhappy/krishi/assets/115190222/9a4d68b7-05ee-45cf-8222-57303765c7f2" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/f7099334-f6e0-4beb-a6cd-394e682b7796" alt="News App Screenshot 1" width="150" >
<!--   Add space here -->
</div>




### Borrower's Dashboard
<div style="display: inline-block; margin-right: 20px; display: flex; justify-content: space-around;">
<img src="https://github.com/rockyhappy/krishi/assets/115190222/a8ba10b7-91bf-4112-b315-7b931ed0bf28)" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/f122a4b9-9090-41ce-9ce1-9b17ae527008" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/9f6e04b9-c5b1-4759-9231-d95110ad2d22" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->  
<img src="https://github.com/rockyhappy/krishi/assets/115190222/268bcb58-c793-44d1-8132-a33810076035" alt="News App Screenshot 1" width="150" >
<!-- Add space here -->
<img src="https://github.com/rockyhappy/krishi/assets/115190222/b355f252-f85e-432b-9392-7a536ecdc313" alt="News App Screenshot 1" width="150" >
<!--   Add space here -->
</div>

## Video Demonstration
https://github.com/rockyhappy/krishi/assets/115190222/fbf23231-13ad-4f77-9d28-ce522e2681ad


https://github.com/rockyhappy/krishi/assets/115190222/15c32800-bd40-44bf-ade5-b835e6c6e6c7



https://github.com/rockyhappy/krishi/assets/115190222/689a0398-0117-4a7a-92a0-63a8eae1e398



https://github.com/rockyhappy/krishi/assets/115190222/6d1cbd8a-6a88-4ef0-84cf-aaf56fbc88f3



https://github.com/rockyhappy/krishi/assets/115190222/6e82cba8-8f8d-41d3-86fe-6c946f9afef4



https://github.com/rockyhappy/krishi/assets/115190222/72789548-d569-4c2a-b9ee-492632ba6c22



https://github.com/rockyhappy/krishi/assets/115190222/0e931aa5-e874-4826-9799-148c5342d64a



https://github.com/rockyhappy/krishi/assets/115190222/df3aca9f-c9f4-43bd-96c4-aafaa88b5dd3



https://github.com/rockyhappy/krishi/assets/115190222/55e18304-3335-4e3e-9285-42c69af48403



https://github.com/rockyhappy/krishi/assets/115190222/00c3153c-2c18-4b06-ba51-875a9247bbc4



https://github.com/rockyhappy/krishi/assets/115190222/814bcd50-59cb-4b72-9409-c16cdba6d616



https://github.com/rockyhappy/krishi/assets/115190222/2f127f2c-6b14-487f-953f-df6545477c78



https://github.com/rockyhappy/krishi/assets/115190222/8f298a3c-4f78-4454-965e-95a57b1d4345




## Getting Started
To start using Krishi Kalyaan:
1. Clone the repository: `git clone https://github.com/your-repo/krishi-kalyaan.git`
2. Open the project in Android Studio.
3. Build and run the application on an Android device or emulator.
4. Log in or sign up using your phone number.
5. Choose your role as a lender or borrower and start lending or borrowing farming items.

## Contributing
Contributions to Krishi Kalyaan are welcome! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature-name`.
3. Make your changes and commit them: `git commit -m 'Add new feature'`.
4. Push to the branch: `git push origin feature-name`.
5. Create a pull request with a detailed description of your changes.

## Contact
For any inquiries or feedback regarding Krishi Kalyaan, please contact the maintainer.

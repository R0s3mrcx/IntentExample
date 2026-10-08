# IntentExample

A simple Android application demonstrating explicit and implicit intents using Java and XML.

## Features

- Open a second activity using an explicit intent
- Send a message between activities
- Open a website using an implicit intent
- Open a geographic location using an implicit intent

## Requirements

- Android Studio
- Android SDK
- Android emulator or Android device
- Java

## How to run

1. Open the project in Android Studio.
2. Wait for Gradle to finish syncing.
3. Select an emulator or connected Android device.
4. Run the application.

## Explicit Intent

The application uses an explicit intent to open `SecondActivity` from `MainActivity`.

The message is passed using an intent extra:

```java
Intent intent = new Intent(MainActivity.this, SecondActivity.class);
intent.putExtra("MESSAGE", "Message sent from MainActivity");
startActivity(intent);
```

`SecondActivity` retrieves the message using:

```java
Intent intent = getIntent();
String message = intent.getStringExtra("MESSAGE");
```

## Implicit Intent

The application uses an implicit intent to open a website:

```java
Uri uri = Uri.parse("https://www.android.com");
Intent intent = new Intent(Intent.ACTION_VIEW, uri);
startActivity(intent);
```

Android selects an application capable of handling the requested action.

The application also uses an implicit intent to open a geographic location:

```java
Uri uri = Uri.parse("geo:50.3217,19.1949");
Intent intent = new Intent(Intent.ACTION_VIEW, uri);
startActivity(intent);
```

## Control Question

Why is an explicit Intent appropriate when launching a specific Activity inside your own application, while an implicit Intent can be used to open a web page?

-An explicit Intent is used when we already know which Activity we want to open. In this case, MainActivity knows that it needs to open SecondActivity, so we can specify it directly.

-An implicit Intent works a little differently. Instead of choosing a specific Activity or app, we tell Android what we want to do and Android finds an app that can handle it. For example, when opening a website, we don't need to know which browser the user has installed.

## Screenshots

### Main Activity

<img src="screenshots/01_main_activity.png" width="300">

### Second Activity

<img src="screenshots/02_second_activity.png" width="300">

### Website

<img src="screenshots/03_website.png" width="300">

### Location

<img src="screenshots/04_location.png" width="300">

## Author

Fabricio Farro

Student ID: 58122
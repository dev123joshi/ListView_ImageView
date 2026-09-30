# 📱 Create an Adaptive UI Using ListView and ImageView

## 📌 Project Title

**Adaptive UI using ListView and ImageView**

---

## 🎯 Aim

To develop an Android application that demonstrates an adaptive user interface using **ListView and ImageView** with Kotlin and XML.

---

## 🎯 Objectives

The objectives of this experiment are:

* To understand the concept of adaptive user interfaces.
* To use `ListView` to display a list of items.
* To use `ImageView` to display images/icons.
* To create a custom layout for each ListView item.
* To use an Adapter to connect data with the ListView.
* To handle item click events.
* To create a UI that adjusts to different screen sizes.

---

## 🛠️ Technologies Used

* **Android Studio**
* **Kotlin**
* **XML**
* **Android SDK**
* **ListView**
* **ImageView**
* **ArrayAdapter**

---

# 📖 Concept / Technology

## 📋 ListView

`ListView` is an Android UI component used to display a vertically scrolling list of items.

In this application, ListView displays different technology-related topics such as:

* Android Development
* Kotlin Programming
* Database
* Artificial Intelligence
* Web Development

---

## 🖼️ ImageView

`ImageView` is used to display an image or icon.

Each ListView row contains an ImageView along with a title and description.

The application uses a built-in Android icon, so no external image files are required.

---

## 🔄 Adapter

An Adapter connects the application's data with the ListView.

The custom `ItemAdapter` is responsible for:

* Creating individual list rows.
* Setting the item title.
* Setting the item description.
* Displaying the ImageView.

---

# 💡 Scenario

The application represents a simple **Learning Topics List**.

A student can view different technology topics in a vertically scrolling list.

Each item contains:

* An image/icon.
* Topic name.
* Short description.

When the user selects an item, a Toast message displays the selected topic.

---

# ✨ Features

* Adaptive user interface.
* Scrollable ListView.
* ImageView in every list item.
* Custom ListView row layout.
* Multiple learning topics.
* Item click handling.
* Toast message for selected items.
* Simple and beginner-friendly design.
* Works without external image resources.

---

# 📂 Project Folder Structure

```text
AdaptiveListView/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── adaptivelistview/
│           │               ├── MainActivity.kt
│           │               └── ItemAdapter.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_main.xml
│           │   │   └── list_item.xml
│           │   │
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── testcase1.png
│   ├── testcase2.png
│   └── testcase3.png
│
└── README.md
```

---

# 📄 Important Files

## 1. `MainActivity.kt`

This is the main Activity of the application.

It:

* Initializes the ListView.
* Creates the list of topics.
* Creates the descriptions.
* Connects the custom adapter.
* Handles item click events.

---

## 2. `ItemAdapter.kt`

This is the custom Adapter.

It:

* Inflates the `list_item.xml` layout.
* Finds the ImageView and TextViews.
* Sets the image.
* Sets the title.
* Sets the description.
* Creates each ListView row.

---

## 3. `activity_main.xml`

This file contains:

* Application title.
* ListView.

The ListView uses the available screen space and allows the user to scroll through the topics.

---

## 4. `list_item.xml`

This file defines the appearance of each ListView item.

Each row contains:

```text
ImageView
   +
Title
   +
Description
```

---

# ▶️ How to Run the Application

1. Open **Android Studio**.
2. Open the `AdaptiveListView` project.
3. Wait for Gradle synchronization to complete.
4. Start an Android Emulator or connect an Android device.
5. Click **Run ▶**.
6. The application will open.
7. View the list of learning topics.
8. Scroll through the list.
9. Tap any topic.
10. Verify the Toast message.

---

# 📱 Output

The application displays a screen similar to:

```text
------------------------------------

          Adaptive ListView

   [ℹ] Android Development
       Learn Android application
       development

   [ℹ] Kotlin Programming
       Learn Kotlin programming
       concepts

   [ℹ] Database
       Learn database management
       concepts

   [ℹ] Artificial Intelligence
       Learn artificial intelligence
       concepts

   [ℹ] Web Development
       Learn web development
       technologies

------------------------------------
```

The list can be scrolled vertically when the content exceeds the available screen area.

---

# 🧪 Test Cases

## Test Case 1 – Launch Application

| Field           | Details                                                          |
| --------------- | ---------------------------------------------------------------- |
| Test Case ID    | TC01                                                             |
| Test            | Launch the application                                           |
| Input           | Open the application                                             |
| Expected Result | Adaptive ListView with ImageViews and topic details is displayed |
| Status          | Pass                                                             |

### Screenshot

Save the screenshot as:

```text
screenshots/testcase1.png
```

---

## Test Case 2 – Scroll ListView

| Field           | Details                                     |
| --------------- | ------------------------------------------- |
| Test Case ID    | TC02                                        |
| Test            | Scroll the ListView                         |
| Input           | Swipe upward or downward                    |
| Expected Result | User can view all available learning topics |
| Status          | Pass                                        |

### Screenshot

<img width="1860" height="982" alt="image" src="https://github.com/user-attachments/assets/fef3d735-b208-482e-a105-cdd6810f6758" />

---

## Test Case 3 – Select List Item

| Field           | Details                                   |
| --------------- | ----------------------------------------- |
| Test Case ID    | TC03                                      |
| Test            | Select a list item                        |
| Input           | Tap any learning topic                    |
| Expected Result | Toast message displays the selected topic |
| Status          | Pass                                      |

### Example

If the user taps **Kotlin Programming**, the application displays:

```text
Selected: Kotlin Programming
```

### Screenshot

Save the screenshot as:

```text
screenshots/testcase3.png
```

---




# 🎓 Learning Outcomes

After completing this experiment, the following concepts were understood:

* Creating adaptive Android layouts.
* Using `ListView`.
* Using `ImageView`.
* Creating custom list item layouts.
* Working with Android Adapters.
* Displaying dynamic data in a ListView.
* Handling ListView item clicks.
* Creating scrollable interfaces.
* Designing layouts that use available screen space.

---

# ⚙️ Requirements

### Software Requirements

* Android Studio
* Kotlin
* Android SDK
* Gradle

### Hardware Requirements

* Laptop or Desktop
* Android Emulator or Android Smartphone

---

# ✅ Conclusion

The **Adaptive UI using ListView and ImageView** application was successfully developed using **Kotlin and XML in Android Studio**.

The application demonstrates how a ListView can be combined with ImageView and a custom Adapter to create a simple, scrollable and adaptive user interface. The application also handles item selection and displays the selected topic using a Toast message.

---

# 👩‍🎓 Student Details

**Name:** Devraath Joshi
**USN:** 25MCAR0091

**Experiment:** Create an Adaptive UI Using ListView and ImageView

---

# 📚 References

* Android Developer Documentation
* Android Studio Documentation
* Kotlin Documentation

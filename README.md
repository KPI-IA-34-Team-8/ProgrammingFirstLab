# Лабораторна робота №1
## Тема: Основи Web
## Виконав(-ли): Сухоручкін Гліб і Янович Марія
---
## Висновки:
---
## Контрольні питання:
### 1. Що таке архітектура «клієнт-сервер»?
Генералізоване поняття взаємодії користувача з системою, де користувач(клієнт) надсилає запит системі(на сервер), після чого запит обробляється і клієнт отримує відповідь

### 2. В чому полягає різниця між HTML, HTTP та HTTPS?
HTML - мова програмування,
HTTP - простокол передачі данх від клієнта до сервера без захисту даних,
HTTPS - простокол передачі данх від клієнта до сервера **із захистом даних**.

### 3. В чому полягають відмінності методів GET та POST протоколу HTTP?
get - метод для читання, що не відповідає на запит клієнта(не робить респонз)
post - метод для писання, через який можна взаємодіяти з клієнтом, відповідаючи на його запит або записувати інформацію

### 4. Що таке сервлет?
оператор у JVM, о забезпечує роботу методів без зайвого навантаження оперативки

### 5. В чому полягають відмінності, переваги та недоліки використанні CGI-скриптів у порівнянні з сервлетами?

Відмінності:
   - CGI-скрипти запускаються окремими процесами для кожного запиту
   - CGI-скрипти можуть бути написані на різних мовах програмування, сервлети - Java.
     
Переваги:
   - Сервлети більш ефективні, бо виконують задачу у межах одного абьо кількох процесів. CGI створює новий процес для кожного запиту.
   - У сервлетах можна використовувати код ще раз, що спрощує розробку та підтримку програм.
     
Недоліки:
   - Висока витрата ресурсів через створення нового процесу для кожного запиту
   - При великому навантаженні CGI може призвести до перевантаження сервера 
	
### 6. Чим сервер Apache HTTP Server відрізняється від сервера Apache Tomcat?
Apache HTTP Server є веб-сервером для статичного вмісту, тоді як Apache Tomcat - це контейнер для виконання динамічного вмісту

### 7. Для чого потрібен клас HttpServlet? Як його використовувати? Де він знаходиться? (у якому пакеті? у якій бібліотеці?)
Клас HttpServlet є частиною Java EE (Enterprise Edition) API і призначений для створення веб-додатків на мові Java, які працюють з протоколом HTTP. Він знаходиться у пакеті javax.servlet.http і використовується для обробки HTTP-запитів і відповідей. Цей клас є базовим класом для створення власних веб-сервлетів у Java, і його можна розширити для обробки різних типів запитів (GET, POST, PUT, DELETE тощо) та відправки відповідей клієнтам.

### 8. Для чого потрібен файл web.xml та чи можна створити веб-застосунок без нього?
Файл web.xml використовується для конфігурації веб-застосунків у середовищі Java EE. У цьому файлі можна визначити налаштування сервлетів, фільтри, налаштування контексту додатка та інші параметри.
Можна і **без web.xml**, але для цього потрібно використовувати **новіші версії Java EE або стандарти Java Servlet**, які підтримують альтернативний спосіб конфігурації за допомогою **аннотацій**.

### 9. В чому полягає різниця між пакетом «javax.servlet» та «jakarta.servlet»?
Назва та права на власність.
Пакет "jakarta.servlet" є наступником "javax.servlet" і використовується в оновленому стандарті, який розробляється проектом Eclipse Jakarta EE.
Основна різниця полягає у тому, що "javax.servlet" був частиною стандартів Java EE, тоді як "jakarta.servlet" є частиною оновленого стандарту Jakarta EE, який продовжує розвиток та підтримку цих технологій.

---
## Висновки:
У ході цієї лаборатоної роботи, наша команда здобула нові знання у сфері основ WEB. Також під час виконання, ми застосували вивчену інформацію на практиці, спробувавши дістати нові навички.

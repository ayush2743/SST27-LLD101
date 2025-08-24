# Exercise ex01

How to run:
```bash
cd src
javac Demo01.java
java Demo01
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

SOLID Violations Found:
- SRP: OrderService handles multiple responsibilities (tax calculation, email sending, order storage)
- DIP: OrderService directly depends on concrete EmailClient instead of abstraction
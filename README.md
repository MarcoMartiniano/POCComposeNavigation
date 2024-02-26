# POCComposeNavigation
Multi-module navigation with compose and bottomNavigationBar, using Koin as DI.

This proof of concept(POC) was made to evaluate navigation using a bottomNavigation bar with its own navController and
navigation outside bottomNavigationBar(e.g. if you need a login screen before or don't want to show the bottomNavigationBar)

Take as example HomeScreen to use NavigationManager with a separate navigation layer.

Take as example HomeScreen2 or HomeScreen3 if you want to navigate passing onClick action as parameter. 
(you can also see an epic branch created to show this approach).
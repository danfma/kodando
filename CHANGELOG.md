# CHANGELOG

## 0.2.1 (reset)

### BREAKING CHANGES

- I removed the mobx libraries because of problems in runtime. Maybe I will recreate
  them after.
- `kodando-react` now uses a previous definition model and something
  more close to what JetBrains is using on `Ktor`. The previous one
  did a lot of magic to work properly and if JetBrains changed anything in the 
  code generation, that could break all components. So, It's better to revert to a more
  secure representation, while not the best one. Give a look at the samples to understand
  what had changed (sorry!); 


### FUTURE CHANGE

- I'm checking the possibility to move to the new `kotlin-frontend-plugin`
  because of its nice features and npm integration. When moving to it, the
  project won't be distributed by NPM anymore but only at bintray;
- Why am I holding on? It's slow and doesn't support multiple projects right now.

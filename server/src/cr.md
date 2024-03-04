1. Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?
2. La base de donnée va se créé correctement meme en l'absence des @Columns car on est en create,
3. par exmple, le type enuméré n'est pas précisé masi la base de donné va comprendre que c est un type 
4. Enum.Ordinal et va donc le mettre de type intger
2. Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ?
3. L'effet en plus comparé a l'autre est que le Colmun(unique =true) va rendre un attribut unique, le reste ne change pas
3. À votre avis, dans quels cas est-il néce ssaire de mettre les annotations @Column ?
4. pour les unique.
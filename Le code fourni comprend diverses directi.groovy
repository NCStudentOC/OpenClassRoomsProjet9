Le code fourni comprend diverses directives pour configurer les en-têtes de mise en cache et de Content-Security-Policy (CSP). Cependant, il est possible que certaines de ces directives ne soient pas appliquées pour diverses raisons. Voyons le code en détail et identifions les problèmes potentiels :

Directives de mise en cache:

Les directives SetOutputFilter DEFLATE et AddOutputFilterByType DEFLATE activent la compression gzip pour certains types de contenu.
Les directives BrowserMatch sont obsolètes et ne sont pas recommandées pour les navigateurs modernes.
Les en-têtes Cache-Control sont définis pour différentes extensions de fichier, notamment les images, les scripts JavaScript, les feuilles de style CSS et les pages HTML. Ces en-têtes définissent la durée de mise en cache de ces ressources.
Content-Security-Policy:

La directive Header set Content-Security-Policy "script-src 'self';" définit un en-tête CSP qui limite l'exécution des scripts aux seuls scripts provenant de la même origine que la page.
Problèmes potentiels:

Les modules mod_headers et mod_expires doivent être activés pour que les directives de mise en cache fonctionnent. Assurez-vous que ces modules sont activés dans votre configuration Apache.
La directive Header set Content-Security-Policy peut ne pas être appliquée si d'autres en-têtes CSP sont définis dans la réponse. Vérifiez les en-têtes CSP conflictuels dans votre code ou votre configuration du serveur.
Si vous utilisez un réseau de diffusion de contenu (CDN) ou un proxy de mise en cache, il peut remplacer ou ignorer les directives de mise en cache. Assurez-vous que votre CDN ou proxy est configuré pour respecter les en-têtes de mise en cache.
Si vous utilisez une extension de navigateur ou un logiciel de sécurité, il peut interférer avec l'en-tête CSP. Essayez de désactiver les extensions ou logiciels de sécurité qui pourraient modifier ou bloquer les en-têtes CSP.
Problème spécifique du CSP:

Le problème spécifique que vous avez mentionné est que l'en-tête CSP Header set Content-Security-Policy "script-src 'self';" ne semble pas être pris en compte. Cela peut être dû à l'une des raisons suivantes :

L'en-tête CSP est ignoré par le navigateur ou le proxy de mise en cache.
L'en-tête CSP est en conflit avec un autre en-tête CSP dans votre code ou votre configuration du serveur.
L'extension de navigateur ou le logiciel de sécurité que vous utilisez interfère avec l'en-tête CSP.
Pour résoudre ce problème, vous pouvez essayer les solutions suivantes :

Vérifiez que l'en-tête CSP est correctement défini dans votre configuration Apache.
Essayez de désactiver votre extension de navigateur ou votre logiciel de sécurité pour voir si cela résout le problème.
Si vous utilisez un CDN ou un proxy de mise en cache, contactez le fournisseur pour obtenir de l'aide pour configurer votre CDN ou proxy pour respecter les en-têtes CSP.
Solutions spécifiques:

Pour résoudre le problème de la mise en cache, vous pouvez essayer les solutions suivantes :

Assurez-vous que les modules mod_headers et mod_expires sont activés dans votre configuration Apache.
Si vous utilisez un CDN ou un proxy de mise en cache, contactez le fournisseur pour obtenir de l'aide pour configurer votre CDN ou proxy pour respecter les en-têtes de mise en cache.
Si vous utilisez une extension de navigateur ou un logiciel de sécurité, essayez de désactiver les extensions ou logiciels de sécurité qui pourraient modifier ou bloquer les en-têtes de mise en cache.
J'espère que cela vous aidera à résoudre votre problème.
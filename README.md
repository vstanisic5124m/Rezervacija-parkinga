# Rezervacija-parkinga
Potrebno je implementirati kreativnu aplikaciju za rezervaciju parkinga zaposlenih u banci. Front: Angular, Back:Spring Boot; Baza: Oracle .
SPECIFIKACIJA opsirno :
Potrebno je razviti aplikaciju koja omogućava deljenje parking mesta unutar firme. U firmi postoje
dva parking prostora: jedan sa rezervisanim mestima u dvorištu, gde je potrebno pokazati
legitimaciju prilikom ulaska, i drugi parking u javnoj garaži sa 100 zakupljenih mesta, za koja je
određenom broju kolega dodeljena kartica za pristup.
Aplikacija treba da omogući vlasnicima parking mesta (u dvorištu i javnoj garaži) da označe dane
kada ne dolaze na posao tokom nedelje ili meseca, kako bi se ta mesta oslobodila kolegama kojima
je parking potreban.
Proces bi funkcionisao tako što bi vlasnici ulazili u aplikaciju i označavali dane odsustva, dok bi
kolege koje žele da koriste njihova mesta birale i rezervisale slobodna parking mesta.
Ukoliko kolega ima parking mesto u dvorištu firme, nije potrebno dodatno obaveštavati službu u
banci. S druge strane, kolege koje imaju kartice za parking moraju ih doneti na pult i ostaviti za
preuzimanje narednog dana.
Rezervacija parking mesta funkcionise po principu "ko prvi stigne, prvi rezerviše". U slučaju
nepredviđenih okolnosti, vlasnik parking mesta može povući rezervaciju najkasnije do 17h
prethodnog dana. Ako osoba koja je rezervisala određeno parking mesto ne dođe na posao do 9h,
to mesto se oslobađa kolegi kojem je parking potreban.

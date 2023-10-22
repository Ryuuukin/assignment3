# assignment3
The demostration of Adapter Design Pattern to the topic KittenDorm

I used structure Object Adapter' described in refactoring-guru:
1. Main. java - client class that interacts with 'owner' or 'staff' and need to access information in a SPECIFIC format (e.g. KittenInfo.java)
2. KittenDormService - service class that provides data about kittens which is NOT COMPATIBLE with the client's needs (different data structures)
3. KittenDormAdapter - adapter that connects the communication between 'client' and service'. It uses client interface "KittenDormlCient.java" and wraps the
"KittenDormService": translates SERVICE DATA → client expected data: RawkittenData.java → KittenInfo.java (which is client's expected format)
4. KittenDormClient - client interface shows what protocol clients must follow


WORKING LOGIC:

                staff OR owner
             /                 \
     addFoundKitten       searchForLostkitten
                            |Rawkitteninfo|
              \             /
            (KittenDormadapter)
          |Rawkitten → Kitteninfo|
                     |
      receive info about lost kittens



SUPPORTED PRINCIPLES:
SRP, OCP, KISS, DRY

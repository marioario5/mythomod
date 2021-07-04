# mythomod
The code for mythomod on curseforge

ENTITY FILES:

data package:
CapabilityEntityCharge.java
ChargeEventHandler.java
DefaultEntityCharge.java
EntityChargeProvider.java
IEntityCharge.java

entity package:
Unicorn.java (Undergoing Changes)
UnicornModel.java (Undergoing Major Changes)
UnicornRenderer.java

setup package:
ClientSetup.java
ModSetup.java

EntityInit.java and Mythomod.java for registration

SOUND FILES:
SoundInit.java
Mythomod.java (Eventbus Registration)

BLOCK AND ITEM FILES:
BlockInit.java
ItemInit.java (No Eventbus Registration in main class because it uses an event bus in those classes)

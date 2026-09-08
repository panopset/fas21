# ![fas21](projects/slab/raw/images/fas21.png) Fas21

Multi-platform blackjack game with fast deal feature. Formerly known as Panopset Blackjack, but rebranded for these
reasons:

* Gambling is stupid, and the author did not want Panopset software to continue to be directly besmirched with a gambling app.
* Fas21 better reflects the "fast deal" feature, that separates this blackjack app from all the others.
* While still indirectly besmirching Panopset, fas21 showcases how you may utilize Panopset products to publish your own apps and web sites.

# The first claim about this game is that it will only lead you to ruin whether, or not it has any bugs.

Here are the other claims:

* It is your responsibility to independently verify the basic strategy [table](projects/fas21engine/src/main/resources/basic.txt) used by this game.
  * Fas21 is open source, so you are free to make corrections.
* I have seen many people at the tables who have not memorized the basic strategy. They may as well play the
slots. Fas21 might help people, who decide to blackjack, last longer at the tables.


## Projects
* [fas21engine](projects/fas21engine/README.md)
  * Data driven counting systems and basic strategy charts.
  * Automatic deal, to test both counting and betting strategies at tens of thousands of hands per second.
  * Fast deal configuration option, to allow users to skip seeing the results of each hand, just whether or not they made a basic strategy mistake.  I only wrote this, because I wanted this feature.
* fas21desk
  * Fas21 desktop application, a Panopset based app.

# License

Fas21 Blackjack is open source software, under the [GNU GENERAL PUBLIC LICENSE](https://www.gnu.org/licenses/gpl-3.0.en.html), with the following
additional provisions:

## Fas21 Provision 1

Under no circumstances is Fas21 Blackjack, or any of its derivatives, to be used to drive a real money game.
The sole purpose is to help people, who decide they want to play blackjack, last a little longer at the tables.

## Fas21 Provision 2

Prominently displayed in the end product description somewhere must a link to 
[Gamblers Anonymous](http://gamblersanonymous.com), 
along with the following disclaimer:

* "The only claim made about this game is that it will only lead you to ruin whether, or not it has any bugs."

I probably won't take the time to sue you, if you don't abide by these provisions.
It will be enough to trust in cosmic justice, should you foolishly decide to ignore them.

## Scripts

| Linux/Mac    | Windows     | Purpose                                           |
|--------------|-------------|---------------------------------------------------|
| ./publish.sh | publish.cmd | Publish fas21 locally in ~/projects/fas21/deploy. |

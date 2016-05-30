Android Wear Project: Sunshine Watch Face
===================================

Adds a watch face to Sunshine that displays the current
day's high and low temps and weather condition icon.

Implementation
--------------

After running the official samples and reading the docs,
I searched github for a library to reduce the `Wearable.DataApi`
boilerplate and found [`Courier`](https://github.com/denley/courier),
which provides lightweight annotations. I first checked that its
sample app works, then added a watch face project to courier's
samples, again to check that the library works as expected.

Finally I used my expanded sample as a model to extend Sunshine.


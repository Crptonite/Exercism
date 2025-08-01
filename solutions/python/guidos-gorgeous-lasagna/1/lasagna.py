"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""

# Constants
EXPECTED_BAKE_TIME = 40  # in minutes
PREPARATION_TIME = 2     # in minutes per layer

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(layers):
    """Calculate total preparation time based on the number of layers.

    :param layers: int - number of layers of lasagna.
    :return: int - total preparation time (in minutes) based on 'PREPARATION_TIME'.
    """
    return layers * PREPARATION_TIME


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate total elapsed cooking time.

    :param number_of_layers: int - number of layers of lasagna.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - total elapsed time (prep + bake) in minutes.
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time


# Sample function calls
print(bake_time_remaining(30))         # Output: 10
print(preparation_time_in_minutes(3))  # Output: 6
print(elapsed_time_in_minutes(3, 20))  # Output: 26

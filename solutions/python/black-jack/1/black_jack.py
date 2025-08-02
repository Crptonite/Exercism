"""Functions to help play and score a game of blackjack.

How to play blackjack:    https://bicyclecards.com/how-to-play/blackjack/
"Standard" playing cards: https://en.wikipedia.org/wiki/Standard_52-card_deck
"""


def value_of_card(card):
    """Determine the scoring value of a card.

    :param card: str - given card.
    :return: int - value of a given card.  See below for values.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1 
    3.  '2' - '10' = numerical value.
    """

    if card in ['J', 'Q', 'K']:
        return 10
    elif card == 'A':
        return 1 
    else:
        return int(card)



def higher_card(card_one, card_two):
    """Determine which card has a higher value in the hand.

    :param card_one, card_two: str - cards dealt in hand.  See below for values.
    :return: str or tuple - resulting Tuple contains both cards if they are of equal value.

    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 1
    3.  '2' - '10' = numerical value.
    """
    value1 = value_of_card(card_one)
    value2 = value_of_card(card_two)
    if value1 > value2:
        return card_one
    elif value2 > value1:
        return card_two
    else:
        return (card_one, card_two)



def value_of_ace(card_one, card_two):
    """Determine if the upcoming Ace should be worth 1 or 11.

    :param card_one: str - first card in hand.
    :param card_two: str - second card in hand.
    :return: int - 1 or 11 depending on which value of Ace is safer.
    """
    # If an Ace is already in hand, the new Ace must be worth 1
    if card_one == 'A' or card_two == 'A':
        return 1

    total = value_of_card(card_one) + value_of_card(card_two)

    # If adding 11 keeps us at or under 21, it's safe to use 11
    if total + 11 <= 21:
        return 11
    else:
        return 1


# def is_blackjack(card_one, card_two):
#     """Determine if the hand is a 'natural' or 'blackjack'.

#     :param card_one, card_two: str - card dealt. See below for values.
#     :return: bool - is the hand is a blackjack (two cards worth 21).

#     1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
#     2.  'A' (ace card) = 11 (if already in hand)
#     3.  '2' - '10' = numerical value.
#     """
#     total = value_of_card(card_one) + value_of_card(card_two)
#     if total == 21 and ('A' in [card_one, card_two]):
#         return True
#     else: 
#         return False
# def is_blackjack(card_one, card_two):
#     """Determine if the hand is a 'natural' blackjack (Ace + ten-card).

#     :param card_one, card_two: str - cards dealt.
#     :return: bool - True if it's a blackjack, False otherwise.
#     """
#     ten_cards = ['10', 'J', 'Q', 'K']
#     return ('A' in [card_one, card_two]) and (card_one in ten_cards or card_two in ten_cards)



def is_blackjack(card_one, card_two):
    """Determine if the hand is a 'natural' or 'blackjack'.
 
    :param card_one, card_two: str - card dealt. See below for values.
    :return: bool - is the hand is a blackjack (two cards worth 21).
 
    1.  'J', 'Q', or 'K' (otherwise known as "face cards") = 10
    2.  'A' (ace card) = 11 (if already in hand)
    3.  '2' - '10' = numerical value.
    """
    hand = [card_one, card_two]
    if 'A' in hand and any(card in hand for card in ['J','K','Q','10']):
        return True
    # elif value_of_card(card_one) + value_of_card(card_two) == 21:
    #     return True
    else:
        return False

def can_split_pairs(card_one, card_two):
    """Check if the two cards can be split (same value).

    :param card_one, card_two: str - cards dealt.
    :return: bool - True if cards can be split, False otherwise.
    """
    return value_of_card(card_one) == value_of_card(card_two)


def can_double_down(card_one, card_two):
    """Determine if a blackjack player can place a double down bet.

    :param card_one, card_two: str - first and second cards in hand.
    :return: bool - can the hand can be doubled down? (i.e. totals 9, 10 or 11 points).
    """
    total = value_of_card(card_one) + value_of_card(card_two)
    return total in [9, 10, 11]
    
    

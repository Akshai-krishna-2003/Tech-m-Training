import 'package:flutter/material.dart';

class PriceModifier extends StatefulWidget {
  @override
  _PriceModifierState createState() => _PriceModifierState();
}

class _PriceModifierState extends State<PriceModifier> {
  int _price = 5000;

  void _increasePrice() {
    setState(() {
      _price += 100;
    });
  }

  void _decreasePrice() {
    setState(() {
      _price -= 100;
    });
  }

  void _multiplyPrice() {
    setState(() {
      _price = (_price * 1.2).round();
    });
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Text(
          'Price: $_price',
          style: TextStyle(fontSize: 28, fontWeight: FontWeight.bold),
        ),
        SizedBox(height: 20),
        ElevatedButton(
          onPressed: _increasePrice,
          child: Text('Increase by Rs. 100'),
        ),
        SizedBox(height: 10),
        ElevatedButton(
          onPressed: _decreasePrice,
          child: Text('Decrease by Rs. 100'),
        ),
        SizedBox(height: 10),
        ElevatedButton(
          onPressed: _multiplyPrice,
          child: Text('Multiply by 1.2 & Round'),
        ),
      ],
    );
  }
}

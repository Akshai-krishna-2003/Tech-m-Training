import 'package:flutter/material.dart';
import '../widgets/price_modifier.dart';

class ThirdPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Third Page'), backgroundColor: Colors.purple),
      body: Center(
        child: PriceModifier(), 
      ),
    );
  }
}

import 'package:firstandroidapp/pages/eighth_page.dart';
import 'package:firstandroidapp/pages/sixth_page.dart';
import 'package:flutter/material.dart';

class FirstPage extends StatelessWidget {
  const FirstPage({super.key});
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('First Page'),
        backgroundColor: Colors.blue, // Set the color for the AppBar
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          ElevatedButton(
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => SixthPage()),
              );
            },
            child: Text('Go to Sixth Page'),
          ),
          ElevatedButton(
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => EighthPage()),
              );
            },
            child: Text('Go to Eighth Page'),
          ),
        ],
      ),
    );
  }
}
